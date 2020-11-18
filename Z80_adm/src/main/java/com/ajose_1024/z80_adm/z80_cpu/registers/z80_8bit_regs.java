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

package com.ajose_1024.z80_adm.z80_cpu.registers ;

/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public enum z80_8bit_regs
{
    B   ( 0,    "B",    0,  "HL" ),
    C   ( 1,    "C",    0,  "HL" ),
    D   ( 2,    "D",    0,  "HL" ),
    E   ( 3,    "E",    0,  "HL" ),
    H   ( 4,    "H",    0,  "HL" ),
    L   ( 5,    "L",    0,  "HL" ),
    $HL ( 6,    "(HL)", 0,  "HL"),
    A   ( 7,    "A",    0,  "HL"),
    
    IXh ( 4,    "IXh",  1,  "IX" ),
    IXl ( 5,    "IXl",  1,  "IX" ), 
    $IX ( 6,    "(IX+d)", 1,"IX" ),
    
    IYh ( 4,    "IYh",  2,  "IY" ),
    IYl ( 5,    "IYl",  2,  "IY" ),
    $IY ( 6,    "(IY+d)", 2,"IY" )
    ;
    
    
    private final   int     reg_num ;
    private final   String  reg_name ;
    private final   int     index_mode ;
    private final   String  index_reg ;
    
    private z80_8bit_regs( int reg_num, String reg_name, int index_mode, String index_reg )
    {
        this.reg_num    = reg_num ;
        this.reg_name   = reg_name ;
        this.index_mode = index_mode ;
        this.index_reg  = index_reg ;
    }
    
    public int reg_num()
    {
        return  this.reg_num ;
    }
    
    
    public String reg_name()
    {
        return  this.reg_name ;
    }
    
    
    public int index_mode()
    {
        return  this.index_mode ;
    }
    
    
    public String index_reg()
    {
        return  this.index_reg ;
    }
    
    
}
