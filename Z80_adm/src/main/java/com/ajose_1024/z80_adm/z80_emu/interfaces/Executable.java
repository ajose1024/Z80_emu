/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajose_1024.z80_adm.z80_emu.interfaces ;

import  com.ajose_1024.z80_adm.z80_cpu.registers.* ;

/**
 *
 * @author Utilizador
 */
public interface Executable
{
    public String get_command_name() ;
    
    public void execute( String[] params ) ;
    
    public void execute_2( reg_16bit params ) ;
}
