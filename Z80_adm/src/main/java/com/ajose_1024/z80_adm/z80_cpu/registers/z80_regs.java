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

package com.ajose_1024.z80_adm.z80_cpu.registers;

/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class z80_regs
{
    public static enum reg_pair
    {
        BC,         // BC register pair (High byte: B,  Low byte: C )
        DE,         // DE register pair (High byte: D,  Low byte: E )
        HL,         // HL register pair (High byte: H,  Low byte: L )
        AF,         // SP register pair (High byte: A,  Low byte: F )
        SP,         // SP register 
        IX,         // IX register  (High byte: IXh,    Low byte: IXl )
        IY,         // IY register  (High byte: IYh,    Low byte: IYl )
        PC          // PC register
    }
    
    
    /**
        ***********************
        * Z80  8 bit registers.
        ***********************
     */
  
    /**
     * Z80  A  8 bit accumulator register.
     */
    public static final reg_8bit A = new reg_8bit() ;
    
    /**
     * Z80  F  8 bit flags register.
     */
    public static final reg_8bit F = new reg_8bit() ;
    
    
    /**
     * Z80  B  8 bit register.
     */
    public static final reg_8bit B = new reg_8bit() ;
    
    /**
     * Z80  C  8 bit register.
     */
    public static final reg_8bit C = new reg_8bit() ;
    
    
    /**
     * Z80  D  8 bit register.
     */
    public static final reg_8bit D = new reg_8bit() ;
    
    /**
     * Z80  E  8 bit register.
     */
    public static final reg_8bit E = new reg_8bit() ;
    
    
    /**
     * Z80  H  8 bit register.
     */
    public static final reg_8bit H = new reg_8bit() ;
    
    /**
     * Z80  L  8 bit register.
     */
    public static final reg_8bit L = new reg_8bit() ;
    
    
    /**
     * Z80  R  7 bit register.
     */
    public static final reg_8bit R = new reg_8bit() ;
    
    
    /**
     * Z80  I  8 bit register.
     */
    public static final reg_8bit I = new reg_8bit() ;
    
    
    /**
     * Z80  IXh  8 bit register.
     */
    public static final reg_8bit IXh = new reg_8bit() ;
    public static final reg_8bit IX_high = z80_regs.IXh ;
    
    /**
     * Z80  IXl  8 bit register.
     */
    public static final reg_8bit IXl = new reg_8bit() ;
    public static final reg_8bit IX_low  = z80_regs.IXl ;
    
    
    /**
     * Z80  IYh  8 bit register.
     */
    public static final reg_8bit IYh = new reg_8bit() ;
    public static final reg_8bit IY_high = z80_regs.IYh ;
    
    /**
     * Z80  IYl  8 bit register.
     */
    public static final reg_8bit IYl = new reg_8bit() ;
    public static final reg_8bit IY_low = z80_regs.IYl ;
    
    
    /**
     * Z80  PCh  8 bit register.
     */
    public static final reg_8bit PCh = new reg_8bit() ;
    public static final reg_8bit PC_high = PCh ;
    
    /**
     * Z80  PCl  8 bit register.
     */
    public static final reg_8bit PCl = new reg_8bit() ;
    public static final reg_8bit PC_low  = PCl ;
    
    
    /**
     * Z80  SPh  8 bit register.
     */
    public static final reg_8bit SPh = new reg_8bit() ;
    public static final reg_8bit SP_high = SPh ;
    
    /**
     * Z80  SPl  8 bit register.
     */
    public static final reg_8bit SPl = new reg_8bit() ;
    public static final reg_8bit SP_low = SPl ;
    
    
    /**
        ************************
        * Z80  16 bit registers.
        ************************
     */
 
    /**
     * Z80  AF  register pair.
     */
    public static final reg_16bit AF = new reg_16bit( A, F ) ;

    /**
     * Z80  BC  register pair.
     */
    public static final reg_16bit BC = new reg_16bit( B, C ) ;

    /**
     * Z80  DE  register pair.
     */
    public static final reg_16bit DE = new reg_16bit( D, E ) ;

    /**
     * Z80  HL  register pair.
     */
    public static final reg_16bit HL = new reg_16bit( H, L ) ;
    
    /**
     * Z80  IX  register pair.
     */
    public static final reg_16bit IX = new reg_16bit( IX_high, IX_low ) ;

    /**
     * Z80  IY  register pair.
     */
    public static final reg_16bit IY = new reg_16bit( IY_high, IY_low ) ;

    /**
     * Z80  SP  register pair.
     */
    public static final reg_16bit SP = new reg_16bit( SP_high, SP_low ) ;

    /**
     * Z80  PC  register pair.
     */
    public static final reg_16bit PC = new reg_16bit( PC_high, PC_low ) ;

    /**
     * Z80  IR  register pair.
     */
    public static final reg_16bit IR = new reg_16bit( I, R ) ;
    
}
