/*
 * Copyright 2015/2020 by Antonio Jose Gomes.
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


import  com.ajose_1024.z80_adm.core.sys.* ;

/**
 *
 * @author Antonio Jose Gomes
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
     * MAX_ADDRESS_SPACE  constant
     */
    public static final int MAX_ADDRESS_SPACE = (int) bits.bit_20.bit_value() ;
    
    
    
     
    
}
