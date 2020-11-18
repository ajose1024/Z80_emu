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
 * Class:   constants
 * 
 * This class holds global constants defined here
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class constants
{
    /**
     * Constant:    MAX_MEMORY_SIZE
     * 
     * This constant holds the MAXIMUM memory size.
     * 
     * Normally it is equal to the MAX_ADDRESS_SPACE, but can be lower.
     */
    public static final int MAX_MEMORY_SIZE = 65536 ;
    
    /**
     * Constant:    MIN_MEM_BLOCK_SIZE
     * 
     * This constant holds the MINIMUM memory block size.
     */
    public static final int MIN_MEM_BLOCK_SIZE = 256 ;
    
    /**
     * Constant:    MEMORY_PAGE_SIZE
     * 
     * This constant holds the memory PAGE size.
     */
    public static final int MEMORY_PAGE_SIZE = 1024 ;
    
    /**
     * Constant:    MAX_MEMORY_BASE_ADDRESS
     * 
     * This constant holds the MAXIMUM memory base address.
     * 
     * This, normally, is the MAX_MEMORY_SIZE minus the MEMORY_PAGE_SIZE.
     */
    public static final int MAX_MEMORY_BASE_ADDRESS = MAX_MEMORY_SIZE
                                                    - MEMORY_PAGE_SIZE ;
    
    /**
     * Constant:    MAX_ADDRESS_SPACE
     * 
     * This constant holds the MAXIMUM address space.
     */
    public static final int MAX_ADDRESS_SPACE = (int) bits.bit_20.bit_value() ;
    
    
    
     
    
}
