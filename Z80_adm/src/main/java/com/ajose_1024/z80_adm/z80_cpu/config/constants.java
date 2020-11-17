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
package com.ajose_1024.z80_adm.z80_cpu.config;

/**
 *
 * @author ADMIN
 */
public class constants
{
    /**
     * MAX_MEMORY_SIZE  constant
    */
    public static final int MAX_MEMORY_SIZE = 65536 ;
    
    /**
     * MIN_MEM_BLOCK_SIZE  constant
     */
    public static final int MIN_MEM_BLOCK_SIZE = 256 ;
    
    /**
     * MAX_BASE_ADDRESS  constant
     */
    public static final int MAX_BASE_ADDRESS = MAX_MEMORY_SIZE - 1024 ;
    
    
    /**
     * 
     */
    public static enum bit_names
    {
        bit_0,              // Value:       1
        bit_1,              // Value:       2
        bit_2,              // Value:       4
        bit_3,              // Value:       8
        bit_4,              // Value:      16
        bit_5,              // Value:      32
        bit_6,              // Value:      64
        bit_7,              // Value:     128
        bit_8,              // Value:     256
        bit_9,              // Value:     512
        bit_10,             // Value:    1024
        bit_11,             // Value:    2048
        bit_12,             // Value:    4096
        bit_13,             // Value:    8192
        bit_14,             // Value:   16384
        bit_15,             // Value:   32768
        bit_16,             // Value:   65536
        bit_17,             // Value:  131072
        bit_18,             // Value:  262144
        bit_19,             // Value:  524288
        bit_20              // Value: 1048576
    } ;
    
    
    /**
     * Class constructor
     */
    public constants()
    {
        
    }
    
    
    
    /**
     * Method:  value( bit_name )
     * 
     * This method receives the name of the bit (from the 'bit_names' enum) and
     * return the value of the bit
     * 
     * @param   bit     (bit_name)      // Bit name
     * @return          (int)           // Bit value
     */
    public int value( bit_names bit_name )
    {
        switch ( bit_name )
        {
            case bit_0:
                return  1 ;
                
            case bit_1:
                return  2 ;
                
            case bit_2:
                return  4 ;
                
            case bit_3:
                return  8 ;
                
            case bit_4:
                return  16 ;
                
            case bit_5:
                return  32 ;
                
            case bit_6:
                return  64 ;
                
            case bit_7:
                return  128 ;
                
            case bit_8:
                return  256 ;
                
            case bit_9:
                return  512 ;
                
            case bit_10:
                return  1024 ;
                
            case bit_11:
                return  2048 ;
                
            case bit_12:
                return  4096 ;
                
            case bit_13:
                return  8192 ;
                
            case bit_14:
                return  16384 ;
                
            case bit_15:
                return  32768 ;
                
            case bit_16:
                return  65536 ;
                
            case bit_17:
                return  131072 ;
                
            case bit_18:
                return  262144 ;
                
            case bit_19:
                return  524288 ;
                
            case bit_20:
                return  1048576 ;
                
            default:
                return  0 ;
        }
    }
    
    
}
