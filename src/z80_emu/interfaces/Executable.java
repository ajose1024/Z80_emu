/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80_emu.interfaces;

/**
 *
 * @author Utilizador
 */
public interface Executable
{
    public String get_command_name() ;
    
    public void execute( String[] params ) ;
}
