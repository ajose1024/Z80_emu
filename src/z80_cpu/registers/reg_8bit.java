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
public class reg_8bit
{
    /**
     * Register
     */
    private int reg_8bit ;
    
    
    /**
     * Class constructor
     * 
     * This is the class constructor
     */
    public reg_8bit()
    {
        this.reg_8bit = 0 ;
    }
    
    
    /**
     * Method:  store( byte_data )
     * 
     * This method stores a byte in the register, ensuring that the value is
     * within the valid range of 0x00 and 0xFF
     * 
     * @param   byte_data   (int)
     */
    public void store( int byte_data )
    {
        this.reg_8bit = AND_FF( byte_data ) ;
    }
    
    
    /**
     * Method:  fetch()
     * 
     * This method fetches the value in the register, ensuring that the returned
     * value is within the valid range of 0x00 and 0xFF
     * 
     * @return  byte_data   (int)
     */
    public int fetch( )
    {
        return  AND_FF( this.reg_8bit ) ;
    }
    
    
    /**
     * Method:  AND_FF
     * 
     * This method receives an INT value and returns another INT value between
     * 0 and 255
     * 
     * @param   byte_data   (int)
     * @return  byte_data   (int)
     */
    private int AND_FF( int byte_data )
    {
        return  byte_data % 0x100 ;
    }
    
}
