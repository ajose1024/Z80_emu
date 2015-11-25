/*
 * Copyright 2015 ADMIN.
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
package z80_cpu.memory;

/**
 *
 * @author ADMIN
 */
public class address_space
{
    
    private final int MEMORY_SIZE = 65536 ;
    
    private byte[] memory ;
    
    
    /**
     * Class constructor
     * 
     * This method initializes the private property 'memory' with an array of
     * bytes of 'MEMORY_SIZE' length
     */
    public address_space( )
    {
        // Define the memory space
        this.memory = new byte[ MEMORY_SIZE ] ;
        
        // Initialize the memory cells
        for( int address = 0 ; address < MEMORY_SIZE ; address++ )
        {
            // Clear each memory cell, setting it to 0
            this.memory[ address ] = 0 ;
        }
    }
    
    
    /**
     * Method:  fetch( address )
     * 
     * This method receives an <address> in the 'address' parameter and returns
     * the byte (8 bit unsigned) value at that address in the memory byte array
     * 
     * @param   address     (int)       Range:  ( 0..65535 )
     * @return              (int)       Range:  ( 0..255 )
     */
    public int fetch( int address )
    {
        // Ensure that the passed memory address in WITHIN memory bounds
        int valid_address = address % MEMORY_SIZE ;
        
        return this.sign_2_unsign_8bit( this.memory[ valid_address ] ) ;
    }
    
    
    /**
     * Method:  store( address, byte_value )
     * 
     * This method receives an <address> in the 'address' parameter and a <byte>
     *  in the 'byte_value' parameter and stores that byte in the memory cell
     * addressed by the 'address' memory address
     * 
     * @param   address     (int)       Range:  ( 0..65535 )
     * @param   byte_value  (int)       Range:  ( 0..255 )
     */
    public void store( int address, int byte_value )
    {
        // Ensure that the passed memory address in WITHIN memory bounds
        int valid_address = address % MEMORY_SIZE ;
        
        this.memory[ valid_address ] = (byte) this.unsign_2_sign_8bit( byte_value % 0x100 ) ;
    }
    
    
    
    
    /**
     * Method sign_2_unsign_8bit( byte_value )
     * 
     * This method converts a signed byte value ( -128 .. 127 ) to an unsigned
     * byte value ( 0 .. 255 )
     * 
     * @param   byte_value  (int)       Range:  ( -128..127 )
     * @return              (int)       Range:  ( 0..255 )
     */
    protected int sign_2_unsign_8bit( int byte_value )
    {
        if( byte_value < 0 )
        {
            // ( 256 + i ) % 0x100
            return  ( 256 + byte_value ) % 0x100 ;
        }
        else
        {
            // byte_value % 0x100
            return  byte_value % 0x100 ;
        }
    }
    
    
    /**
     * Method unsign_2_sign_8bit( byte_value )
     * 
     * This method converts a unsigned byte value ( -0 .. 255 ) to an unsigned
     * byte value ( -128 .. 127 )
     * 
     * @param   byte_value  (int)       Range:  ( 0..255 )
     * @return              (int)       Range:  ( -128..127 )
     */
    protected int unsign_2_sign_8bit( int byte_value )
    {
        if( byte_value < 128 )
        {
            // i % 0x100
            return  byte_value % 0x100 ;
        }
        else
        {
            // ( i - 256 ) % 0x100
            return  ( byte_value - 256 ) % 0x100 ;
        }
    }
    
    
    
    
    
}
