/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80_emu ;

import java.io.* ;
import java.lang.* ;
import z80_cpu.registers.* ;
import z80_emu.tests.* ;

/**
 *
 * @author anemo_000
 */
public class Z80_emu_init
{

    private static final int xpto = 0 ;
    
    private int A_value = z80_cpu.registers.z80_regs.A.fetch() ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        z80_emu.tests.register_tests.B_reg_test( z80_emu.tests.register_tests.Test_type.LIMITS ) ;
        
        System.out.println( "\n\n" ) ;
        
        z80_cpu.registers.reg_8bit my_A_reg = z80_cpu.registers.z80_regs.A ;
        
        System.out.println( "Object: " + z80_cpu.registers.z80_regs.A ) ;
        System.out.println( "Object: " + my_A_reg ) ;
        
        z80_cpu.registers.reg_8bit my_B_reg = z80_cpu.registers.z80_regs.B ;
        
        System.out.println( "Object: " + z80_cpu.registers.z80_regs.B ) ;
        System.out.println( "Object: " + my_B_reg ) ;
        
        
    }
    
}
