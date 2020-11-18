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

package com.ajose_1024.z80_adm.z80_cpu.exec.misc;

import  com.ajose_1024.z80_adm.z80_cpu.registers.* ;
import  com.ajose_1024.z80_adm.z80_emu.interfaces.* ;


/**
 *
 * @author Utilizador
 */
public class NOP implements Executable
{
    private static final String INSTRUCTION_NAME = "NOP" ;
    
    public String get_command_name()
    {
        return  INSTRUCTION_NAME ;
    }
    
    public void execute( String[] params )
    {
        // Instruction: (0x00)  NOP
        
    }
    
    public void execute_2( reg_16bit register )
    {
        
    }
}
