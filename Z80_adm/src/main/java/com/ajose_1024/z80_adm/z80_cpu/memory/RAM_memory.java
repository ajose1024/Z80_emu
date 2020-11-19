/*
 * Copyright 2015 Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>.
 * Copyright 2020 Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>.
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

package com.ajose_1024.z80_adm.z80_cpu.memory;

import com.ajose_1024.z80_adm.z80_cpu.config.constants;


/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class RAM_memory 
{
    /**
     * MAX RAM memory size
     */
    private final int MEMORY_SIZE = memory_sizes.size_64k.value() ;
    
    /**
     * RAM base address
     */
    private final int MEMORY_BASE_ADDRESS ;
    
    private byte[] memory ;
    
    
    /**
     * Class constructor
     * 
     * This method initializes the private property 'memory' with an array of
     * bytes of 'MEMORY_SIZE' length (if 0 is passed on the 'memory_size' para-
     * meter) or of 'memory_size, otherwise
     * 
     * @param   memory_size     (int)
     * @param   base_address    (int)
     */
    public RAM_memory( int memory_size, int base_address )
    {
        // Ensure that 'base_address' does not exceed MAX_MEMORY_SIZE
        int safe_base_address ;
        
        safe_base_address = base_address % constants.MAX_MEMORY_SIZE ;
        
        if( safe_base_address > constants.MAX_MEMORY_BASE_ADDRESS )
        {
            safe_base_address = constants.MAX_MEMORY_BASE_ADDRESS ;
        }
        this.MEMORY_BASE_ADDRESS = safe_base_address ;
        
        // The max available memory size is:
        //      MAX_MEMORY_SIZE - base_address
        int max_mem_size = constants.MAX_MEMORY_SIZE - this.MEMORY_BASE_ADDRESS ;
        
        // Define the memory space
        if( memory_size == 0 )
        {
            this.memory = new byte[ MEMORY_SIZE ] ;
        }
        else
        {
            this.memory = new byte[ memory_size ] ;
        }
        
    }
    
    
    
}
