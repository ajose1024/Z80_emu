/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajose_1024.z80_adm.z80_emu ;

import java.io.* ;
import java.lang.* ;
import com.ajose_1024.z80_adm.z80_cpu.registers.* ;
import com.ajose_1024.z80_adm.z80_emu.tests.* ;
import com.ajose_1024.z80_adm.z80_cpu.memory.* ;
import com.ajose_1024.z80_adm.z80_cpu.registers.* ;

/**
 *
 * @author anemo_000
 */
public class Z80_emu_init
{

    private static final int xpto = 0 ;
    
    private int A_value = z80_regs.A.fetch() ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        register_tests.B_reg_test( register_tests.Test_type.LIMITS ) ;
        
        System.out.println( "\n\n" ) ;
        
        reg_8bit my_A_reg = z80_regs.A ;
        
        System.out.println( "Object: " + z80_regs.A ) ;
        System.out.println( "Object: " + my_A_reg ) ;
        
        reg_8bit my_B_reg = z80_regs.B ;
        
        System.out.println( "Object: " + z80_regs.B ) ;
        System.out.println( "Object: " + my_B_reg ) ;
        
        
        reg_16bit my_HL_reg = z80_regs.HL ;
        
        System.out.println( "Object: " + z80_regs.HL ) ;
        System.out.println( "Object: " + my_HL_reg ) ;
        
        // Create a memory
        
        address_space mem = new address_space( 65536 ) ;
        
        for( int i = 0 ; i < 65536 ; i++ )
        {
            System.out.println(
                                "Address: " + i + " --> Value: " + mem.fetch( i )
                              ) ;
        }
        
//        for( int i = 0 ; i< 256 ; i++ )
//        {
//            if( i < 128 )
//            {
//                System.out.println( i ) ;
//            }
//            else
//            {
//                System.out.println( i - 256 ) ;
//            }
//        }
    }
    
}
