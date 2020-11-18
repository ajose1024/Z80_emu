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
 * Class:   z80_16bit_regs
 * 
 * This class defines the Z80 register names for 16 bit registers
 * 
 * @Type:   ENUM
 * 
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public enum z80_16bit_regs
{
    BC  ( 0,    "BC",   0,  "HL" ),
    DE  ( 1,    "DE",   0,  "HL" ),
    HL  ( 2,    "HL",   0,  "HL" ),
    AF  ( 3,    "AF",   0,  "HL" ),
    SP  ( 2,    "SP",   0,  "SP" ),
    PC  ( 2,    "PC",   0,  "PC" ),
    IX  ( 2,    "IX+d", 1,  "IX" ),
    IY  ( 2,    "IY+d", 2,  "IY" ),
    ;
    
    
    /**
     *  Property:   reg_num
     *  
     *  This private property holds the 8 bit register's number in the 16 bit
     *  register set, used in the dynamic ENUM object instantialization.
     */
    private final   int     reg_num ;
    
    /**
     *  Property:   reg_name
     * 
     *  This private property holds the 8 bit register's name in the 16 bit
     *  register set, used in the dynamic ENUM object instantialization.
     */
    private final   String  reg_name ;
    
    /**
     *  Property:   index_mode
     * 
     *  This private property holds the 8 bit register's index mode in the 16 bit
     *  register set, used in the dynamic ENUM object instantialization.
     */
    private final   int     index_mode ;
    
    /**
     *  Property:   index_reg
     * 
     *  This private property holds the 8 bit register's index register in the
     *  16 bit register set, used in the dynamic ENUM object instantialization.
     */
    private final   String  index_reg ;
    

    /**
     * Constructor:    z80_16bit_regs
     *
     * This is the constructor that builds the dynamic ENUM object on the fly.
     * 
     * @param       (int)       reg_num
     * @param       (String)    reg_name
     * @param       (int)       index_mode
     * @param       (String)    index_reg 
     * 
     * @return      (Object)
     */
    private z80_16bit_regs( int reg_num, String reg_name, int index_mode, String index_reg )
    {
        this.reg_num    = reg_num ;
        this.reg_name   = reg_name ;
        this.index_mode = index_mode ;
        this.index_reg  = index_reg ;
    }
    
    
    /**
     * Method:      reg_num
     * 
     * This public method returns the number of the register in the instruction
     * set encoding.
     * 
     * @return      (int)
     */
    public int reg_num()
    {
        return  this.reg_num ;
    }
    
    /**
     * Method:      reg_name
     * 
     * This public method returns the name of the register (either final or to
     * be post processed in some cases).
     * 
     * @return      (String)
     */
    public String reg_name()
    {
        return  this.reg_name ;
    }
    
    /**
     * Method:      index_mode
     * 
     * This public method returns the 'index mode' of the register.
     * 
     * It can be:
     *      0 : In this case all indirect memory access is done using the HL
     *          memory pointer (HL)
     *      1 : In this case all indirect memory access is done using the IX
     *          memory pointer (IX + disp)
     *      2 : In this case all indirect memory access is done using the IY
     *          memory pointer (IY + disp)
     * 
     * @return 
     */
    public int index_mode()
    {
        return  this.index_mode ;
    }
    
    /**
     * Method:      index_reg
     * 
     * This public method returns the name of the 'index register' to be used
     * in the indirect memory access.
     * 
     * @return 
     */
    public String index_reg()
    {
        return  this.index_reg ;
    }
    
}
