/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
