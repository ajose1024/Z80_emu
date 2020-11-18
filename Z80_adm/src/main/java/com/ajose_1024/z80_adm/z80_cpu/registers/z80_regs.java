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
        BC,         // BC register pair
        DE,         // DE register pair
        HL,         // HL register pair
        SP,         // SP register pair
        IX,         // IX register
        IY,         // IY register
        PC          // PC register
    }
    
    
    
    /**
     * Z80  A  8 bit accumulator register
     */
    public static reg_8bit A = new reg_8bit() ;
    
    /**
     * Z80  F  8 bit flags register
     */
    public static reg_8bit F = new reg_8bit() ;
    
    /**
     * Z80  B  8 bit register
     */
    public static reg_8bit B = new reg_8bit() ;
    
    /**
     * Z80  C  8 bit register
     */
    public static reg_8bit C = new reg_8bit() ;
    
    /**
     * Z80  D  8 bit register
     */
    public static reg_8bit D = new reg_8bit() ;
    
    /**
     * Z80  E  8 bit register
     */
    public static reg_8bit E = new reg_8bit() ;
    
    /**
     * Z80  L  8 bit register
     */
    public static reg_8bit L = new reg_8bit() ;
    
    /**
     * Z80  H  8 bit register
     */
    public static reg_8bit H = new reg_8bit() ;
    
    
    /**
     * Z80  IX  16 bit register lower half
     */
    public static reg_8bit IX_low  = new reg_8bit() ;
    
    /**
     * Z80  IX  16 bit register higher half
     */
    public static reg_8bit IX_high = new reg_8bit() ;
    
    
    public static reg_8bit IY_low  = new reg_8bit() ;
    public static reg_8bit IY_high = new reg_8bit() ;
    
    public static reg_8bit SP_low  = new reg_8bit() ;
    public static reg_8bit SP_high = new reg_8bit() ;
    
    public static reg_8bit PC_low  = new reg_8bit() ;
    public static reg_8bit PC_high = new reg_8bit() ;
    
    public static reg_8bit I = new reg_8bit() ;
    public static reg_8bit R = new reg_8bit() ;
    
    
    
    public static reg_16bit AF = new reg_16bit( F, A ) ;
    public static reg_16bit BC = new reg_16bit( B, C ) ;
    public static reg_16bit DE = new reg_16bit( D, E ) ;
    public static reg_16bit HL = new reg_16bit( H, L ) ;
    
    public static reg_16bit IX = new reg_16bit( IX_high, IX_low ) ;
    public static reg_16bit IY = new reg_16bit( IY_high, IY_low ) ;
    
    public static reg_16bit SP = new reg_16bit( SP_high, SP_low ) ;
    
    public static reg_16bit PC = new reg_16bit( PC_high, PC_low ) ;
    
    public static reg_16bit IR = new reg_16bit( I, R ) ;
    
}
