/*
 * Copyright 2015 Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>.
 *
 * Licensed under the Artistic License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://opensource.org/licenses/Artistic-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package z80_cpu.registers ;

/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class reg_16bit
{
    /**
     * Lower register half
     */
    private reg_8bit lower_reg_half ;
    
    /**
     * Higher register half
     */
    private reg_8bit higher_reg_half ;

    /**
     * Class constructor
     * 
     * This constructor receives 2 objects
     *      ( reg_8bit,  reg_8bit )
     *      ( reg_flags, reg_8bit )
     * and all operations are performed on the appropriate objects
     * 
     * @param   low_byte    (reg_8bit)      // low byte
     * @param   high_byte   (reg_8bit)      // high byte
     */
    public reg_16bit( reg_8bit high_byte_reg, reg_8bit low_byte_reg )
    {
        // Store the lower half register object
        this.lower_reg_half  = low_byte_reg ;
        // Store the higher half register object
        this.higher_reg_half = high_byte_reg ;
        
        // Store 0 in the lower and higher halves of the 16 bit register
        this.lower_reg_half.reset() ;
        this.higher_reg_half.reset() ;
    }
    
    
    /**
     * Method:  store( word_data )
     * 
     * This method stores a word into the register pair, ensuring the value is
     * within the valid range of 0x0000 and 0xFFFF
     * 
     * @param   word_data   (int)
     */
    public void store( int word_data )
    {
        int low_byte  = this.lower_byte( word_data ) ;
        int high_byte = this.higher_byte( word_data ) ;
        this.lower_reg_half.store( low_byte ) ;
        this.higher_reg_half.store( high_byte ) ;
    }
    
    
    /**
     * Method:  fetch( )
     * 
     * This method fetches a word from the register pair, ensuring the value is
     * within the valid range of 0x0000 and 0xFFFF
     * 
     * @return  word_data   (int)
     */
    public int fetch( )
    {
        int low_byte  = this.lower_reg_half.fetch( ) ;
        int high_byte = this.higher_reg_half.fetch( ) ;
        return  this.word_data( high_byte, low_byte ) ;
    }
    
    
    /**
     * Method:  exx_reg( )
     * 
     * This method exchanges the main and the alternate register of both register
     * halves.
     */
    public void exx_reg( )
    {
        this.lower_reg_half.exx_reg( ) ;
        this.higher_reg_half.exx_reg( ) ;
    }
    
    
    /**
     * Method:  reset( )
     * 
     * This method initializes both the main and the alternate register of both
     * register halves
     */
    public void reset( )
    {
        this.lower_reg_half.reset( ) ;
        this.higher_reg_half.reset( ) ;
    }
    
    
    /**
     * Method:  lower_byte( word_data )
     * 
     * This method returns the lower byte of the passed word value
     * 
     * @param   word_data   (int)
     * @return  byte_data   (int)
     */
    private int lower_byte( int word_data )
    {
        return  word_data % 0x100 ;
    }
    
    
    /**
     * Method:  higher_byte( word_data )
     * 
     * This method returns the higher byte of the passed word value
     * 
     * @param   word_data   (int)
     * @return  byte_data   (int)
     */
    private int higher_byte( int word_data )
    {
        return ( word_data - ( word_data % 0x100 ) ) / 0x100 ;
    }


    /**
     * Method:  word_data( high_byte, low_byte )
     * 
     * This method receives 2 byte values and returns the corresponding word
     * value
     * 
     * @param   low_byte    (int)
     * @param   high_byte   (int)
     * @return  word_data   (int)
     */
    private int word_data( int high_byte, int low_byte )
    {
        return  high_byte * 0x100 + low_byte ;
    }

    
    /**
     * Method:  AND_FFFF
     * 
     * This method receives an INT value and returns another INT value between
     * 0 and 65535
     * 
     * @param   word_data   (int)
     * @return  word_data   (int)
     */
    private int AND_FFFF( int word_data )
    {
        if( word_data < 0 )
        {
            word_data = word_data + 0x10000 ;
        }
        return  word_data % 0x10000 ;
    }
    
   
}
