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

package com.ajose_1024.z80_adm.z80_emu.z80_tables ;

import java.util.HashMap ;
import java.util.Map ;
import java.util.Iterator ;
import java.util.Set ;

import com.ajose_1024.z80_adm.core.sys.*;
import com.ajose_1024.z80_adm.z80_emu.interfaces.* ;
import com.ajose_1024.z80_adm.z80_cpu.exec.misc.* ;

/**
 *
 * @author anemo_000
 */
public class z80_main_opcodes
{
    /**
     * Main Z80 opcode table
     * 
     * This table is implemented through a hashmap( integer, runnable ), that
     * maps each opcode to a handling function
     */
     
    /**
     * Hashmap declaration
     */
    private HashMap<Integer, Executable> main_table = new HashMap<>() ;
    
    
    /**
     * Class constructor
     */
    public z80_main_opcodes()
    {
        this.init_z80_main_table() ;
    }
    
    
    private void init_z80_main_table()
    {
        main_table.put( 0x00, new NOP() ) ;
        main_table.put( 0x01, new NOP() ) ;
        main_table.put( 0x02, new NOP() ) ;
        main_table.put( 0x03, new NOP() ) ;
        main_table.put( 0x04, new NOP() ) ;
        main_table.put( 0x05, new NOP() ) ;
        main_table.put( 0x06, new NOP() ) ;
        main_table.put( 0x07, new NOP() ) ;
        main_table.put( 0x08, new NOP() ) ;
        main_table.put( 0x09, new NOP() ) ;
        main_table.put( 0x0A, new NOP() ) ;
        main_table.put( 0x0B, new NOP() ) ;
        main_table.put( 0x0C, new NOP() ) ;
        main_table.put( 0x0D, new NOP() ) ;
        main_table.put( 0x0E, new NOP() ) ;
        main_table.put( 0x0F, new NOP() ) ;

        main_table.put( 0x10, new NOP() ) ;
        main_table.put( 0x11, new NOP() ) ;
        main_table.put( 0x12, new NOP() ) ;
        main_table.put( 0x13, new NOP() ) ;
        main_table.put( 0x14, new NOP() ) ;
        main_table.put( 0x15, new NOP() ) ;
        main_table.put( 0x16, new NOP() ) ;
        main_table.put( 0x17, new NOP() ) ;
        main_table.put( 0x18, new NOP() ) ;
        main_table.put( 0x19, new NOP() ) ;
        main_table.put( 0x1A, new NOP() ) ;
        main_table.put( 0x1B, new NOP() ) ;
        main_table.put( 0x1C, new NOP() ) ;
        main_table.put( 0x1D, new NOP() ) ;
        main_table.put( 0x1E, new NOP() ) ;
        main_table.put( 0x1F, new NOP() ) ;

        main_table.put( 0x20, new NOP() ) ;
        main_table.put( 0x21, new NOP() ) ;
        main_table.put( 0x22, new NOP() ) ;
        main_table.put( 0x23, new NOP() ) ;
        main_table.put( 0x24, new NOP() ) ;
        main_table.put( 0x25, new NOP() ) ;
        main_table.put( 0x26, new NOP() ) ;
        main_table.put( 0x27, new NOP() ) ;
        main_table.put( 0x28, new NOP() ) ;
        main_table.put( 0x29, new NOP() ) ;
        main_table.put( 0x2A, new NOP() ) ;
        main_table.put( 0x2B, new NOP() ) ;
        main_table.put( 0x2C, new NOP() ) ;
        main_table.put( 0x2D, new NOP() ) ;
        main_table.put( 0x2E, new NOP() ) ;
        main_table.put( 0x2F, new NOP() ) ;

        main_table.put( 0x30, new NOP() ) ;
        main_table.put( 0x31, new NOP() ) ;
        main_table.put( 0x32, new NOP() ) ;
        main_table.put( 0x33, new NOP() ) ;
        main_table.put( 0x34, new NOP() ) ;
        main_table.put( 0x35, new NOP() ) ;
        main_table.put( 0x36, new NOP() ) ;
        main_table.put( 0x37, new NOP() ) ;
        main_table.put( 0x38, new NOP() ) ;
        main_table.put( 0x39, new NOP() ) ;
        main_table.put( 0x3A, new NOP() ) ;
        main_table.put( 0x3B, new NOP() ) ;
        main_table.put( 0x3C, new NOP() ) ;
        main_table.put( 0x3D, new NOP() ) ;
        main_table.put( 0x3E, new NOP() ) ;
        main_table.put( 0x3F, new NOP() ) ;

        main_table.put( 0x40, new NOP() ) ;
        main_table.put( 0x41, new NOP() ) ;
        main_table.put( 0x42, new NOP() ) ;
        main_table.put( 0x43, new NOP() ) ;
        main_table.put( 0x44, new NOP() ) ;
        main_table.put( 0x45, new NOP() ) ;
        main_table.put( 0x46, new NOP() ) ;
        main_table.put( 0x47, new NOP() ) ;
        main_table.put( 0x48, new NOP() ) ;
        main_table.put( 0x49, new NOP() ) ;
        main_table.put( 0x4A, new NOP() ) ;
        main_table.put( 0x4B, new NOP() ) ;
        main_table.put( 0x4C, new NOP() ) ;
        main_table.put( 0x4D, new NOP() ) ;
        main_table.put( 0x4E, new NOP() ) ;
        main_table.put( 0x4F, new NOP() ) ;

        main_table.put( 0x50, new NOP() ) ;
        main_table.put( 0x51, new NOP() ) ;
        main_table.put( 0x52, new NOP() ) ;
        main_table.put( 0x53, new NOP() ) ;
        main_table.put( 0x54, new NOP() ) ;
        main_table.put( 0x55, new NOP() ) ;
        main_table.put( 0x56, new NOP() ) ;
        main_table.put( 0x57, new NOP() ) ;
        main_table.put( 0x58, new NOP() ) ;
        main_table.put( 0x59, new NOP() ) ;
        main_table.put( 0x5A, new NOP() ) ;
        main_table.put( 0x5B, new NOP() ) ;
        main_table.put( 0x5C, new NOP() ) ;
        main_table.put( 0x5D, new NOP() ) ;
        main_table.put( 0x5E, new NOP() ) ;
        main_table.put( 0x5F, new NOP() ) ;

        main_table.put( 0x60, new NOP() ) ;
        main_table.put( 0x61, new NOP() ) ;
        main_table.put( 0x62, new NOP() ) ;
        main_table.put( 0x63, new NOP() ) ;
        main_table.put( 0x64, new NOP() ) ;
        main_table.put( 0x65, new NOP() ) ;
        main_table.put( 0x66, new NOP() ) ;
        main_table.put( 0x67, new NOP() ) ;
        main_table.put( 0x68, new NOP() ) ;
        main_table.put( 0x69, new NOP() ) ;
        main_table.put( 0x6A, new NOP() ) ;
        main_table.put( 0x6B, new NOP() ) ;
        main_table.put( 0x6C, new NOP() ) ;
        main_table.put( 0x6D, new NOP() ) ;
        main_table.put( 0x6E, new NOP() ) ;
        main_table.put( 0x6F, new NOP() ) ;

        main_table.put( 0x70, new NOP() ) ;
        main_table.put( 0x71, new NOP() ) ;
        main_table.put( 0x72, new NOP() ) ;
        main_table.put( 0x73, new NOP() ) ;
        main_table.put( 0x74, new NOP() ) ;
        main_table.put( 0x75, new NOP() ) ;
        main_table.put( 0x76, new NOP() ) ;
        main_table.put( 0x77, new NOP() ) ;
        main_table.put( 0x78, new NOP() ) ;
        main_table.put( 0x79, new NOP() ) ;
        main_table.put( 0x7A, new NOP() ) ;
        main_table.put( 0x7B, new NOP() ) ;
        main_table.put( 0x7C, new NOP() ) ;
        main_table.put( 0x7D, new NOP() ) ;
        main_table.put( 0x7E, new NOP() ) ;
        main_table.put( 0x7F, new NOP() ) ;

        main_table.put( 0x80, new NOP() ) ;
        main_table.put( 0x81, new NOP() ) ;
        main_table.put( 0x82, new NOP() ) ;
        main_table.put( 0x83, new NOP() ) ;
        main_table.put( 0x84, new NOP() ) ;
        main_table.put( 0x85, new NOP() ) ;
        main_table.put( 0x86, new NOP() ) ;
        main_table.put( 0x87, new NOP() ) ;
        main_table.put( 0x88, new NOP() ) ;
        main_table.put( 0x89, new NOP() ) ;
        main_table.put( 0x8A, new NOP() ) ;
        main_table.put( 0x8B, new NOP() ) ;
        main_table.put( 0x8C, new NOP() ) ;
        main_table.put( 0x8D, new NOP() ) ;
        main_table.put( 0x8E, new NOP() ) ;
        main_table.put( 0x8F, new NOP() ) ;

        main_table.put( 0x90, new NOP() ) ;
        main_table.put( 0x91, new NOP() ) ;
        main_table.put( 0x92, new NOP() ) ;
        main_table.put( 0x93, new NOP() ) ;
        main_table.put( 0x94, new NOP() ) ;
        main_table.put( 0x95, new NOP() ) ;
        main_table.put( 0x96, new NOP() ) ;
        main_table.put( 0x97, new NOP() ) ;
        main_table.put( 0x98, new NOP() ) ;
        main_table.put( 0x99, new NOP() ) ;
        main_table.put( 0x9A, new NOP() ) ;
        main_table.put( 0x9B, new NOP() ) ;
        main_table.put( 0x9C, new NOP() ) ;
        main_table.put( 0x9D, new NOP() ) ;
        main_table.put( 0x9E, new NOP() ) ;
        main_table.put( 0x9F, new NOP() ) ;

        main_table.put( 0xA0, new NOP() ) ;
        main_table.put( 0xA1, new NOP() ) ;
        main_table.put( 0xA2, new NOP() ) ;
        main_table.put( 0xA3, new NOP() ) ;
        main_table.put( 0xA4, new NOP() ) ;
        main_table.put( 0xA5, new NOP() ) ;
        main_table.put( 0xA6, new NOP() ) ;
        main_table.put( 0xA7, new NOP() ) ;
        main_table.put( 0xA8, new NOP() ) ;
        main_table.put( 0xA9, new NOP() ) ;
        main_table.put( 0xAA, new NOP() ) ;
        main_table.put( 0xAB, new NOP() ) ;
        main_table.put( 0xAC, new NOP() ) ;
        main_table.put( 0xAD, new NOP() ) ;
        main_table.put( 0xAE, new NOP() ) ;
        main_table.put( 0xAF, new NOP() ) ;

        main_table.put( 0xB0, new NOP() ) ;
        main_table.put( 0xB1, new NOP() ) ;
        main_table.put( 0xB2, new NOP() ) ;
        main_table.put( 0xB3, new NOP() ) ;
        main_table.put( 0xB4, new NOP() ) ;
        main_table.put( 0xB5, new NOP() ) ;
        main_table.put( 0xB6, new NOP() ) ;
        main_table.put( 0xB7, new NOP() ) ;
        main_table.put( 0xB8, new NOP() ) ;
        main_table.put( 0xB9, new NOP() ) ;
        main_table.put( 0xBA, new NOP() ) ;
        main_table.put( 0xBB, new NOP() ) ;
        main_table.put( 0xBC, new NOP() ) ;
        main_table.put( 0xBD, new NOP() ) ;
        main_table.put( 0xBE, new NOP() ) ;
        main_table.put( 0xBF, new NOP() ) ;

        main_table.put( 0xC0, new NOP() ) ;
        main_table.put( 0xC1, new NOP() ) ;
        main_table.put( 0xC2, new NOP() ) ;
        main_table.put( 0xC3, new NOP() ) ;
        main_table.put( 0xC4, new NOP() ) ;
        main_table.put( 0xC5, new NOP() ) ;
        main_table.put( 0xC6, new NOP() ) ;
        main_table.put( 0xC7, new NOP() ) ;
        main_table.put( 0xC8, new NOP() ) ;
        main_table.put( 0xC9, new NOP() ) ;
        main_table.put( 0xCA, new NOP() ) ;
        main_table.put( 0xCB, new NOP() ) ;
        main_table.put( 0xCC, new NOP() ) ;
        main_table.put( 0xCD, new NOP() ) ;
        main_table.put( 0xCE, new NOP() ) ;
        main_table.put( 0xCF, new NOP() ) ;

        main_table.put( 0xD0, new NOP() ) ;
        main_table.put( 0xD1, new NOP() ) ;
        main_table.put( 0xD2, new NOP() ) ;
        main_table.put( 0xD3, new NOP() ) ;
        main_table.put( 0xD4, new NOP() ) ;
        main_table.put( 0xD5, new NOP() ) ;
        main_table.put( 0xD6, new NOP() ) ;
        main_table.put( 0xD7, new NOP() ) ;
        main_table.put( 0xD8, new NOP() ) ;
        main_table.put( 0xD9, new NOP() ) ;
        main_table.put( 0xDA, new NOP() ) ;
        main_table.put( 0xDB, new NOP() ) ;
        main_table.put( 0xDC, new NOP() ) ;
        main_table.put( 0xDD, new NOP() ) ;
        main_table.put( 0xDE, new NOP() ) ;
        main_table.put( 0xDF, new NOP() ) ;

        main_table.put( 0xE0, new NOP() ) ;
        main_table.put( 0xE1, new NOP() ) ;
        main_table.put( 0xE2, new NOP() ) ;
        main_table.put( 0xE3, new NOP() ) ;
        main_table.put( 0xE4, new NOP() ) ;
        main_table.put( 0xE5, new NOP() ) ;
        main_table.put( 0xE6, new NOP() ) ;
        main_table.put( 0xE7, new NOP() ) ;
        main_table.put( 0xE8, new NOP() ) ;
        main_table.put( 0xE9, new NOP() ) ;
        main_table.put( 0xEA, new NOP() ) ;
        main_table.put( 0xEB, new NOP() ) ;
        main_table.put( 0xEC, new NOP() ) ;
        main_table.put( 0xED, new NOP() ) ;
        main_table.put( 0xEE, new NOP() ) ;
        main_table.put( 0xEF, new NOP() ) ;

        main_table.put( 0xF0, new NOP() ) ;
        main_table.put( 0xF1, new NOP() ) ;
        main_table.put( 0xF2, new NOP() ) ;
        main_table.put( 0xF3, new NOP() ) ;
        main_table.put( 0xF4, new NOP() ) ;
        main_table.put( 0xF5, new NOP() ) ;
        main_table.put( 0xF6, new NOP() ) ;
        main_table.put( 0xF7, new NOP() ) ;
        main_table.put( 0xF8, new NOP() ) ;
        main_table.put( 0xF9, new NOP() ) ;
        main_table.put( 0xFA, new NOP() ) ;
        main_table.put( 0xFB, new NOP() ) ;
        main_table.put( 0xFC, new NOP() ) ;
        main_table.put( 0xFD, new NOP() ) ;
        main_table.put( 0xFE, new NOP() ) ;
        main_table.put( 0xFF, new NOP() ) ;
    }
    
    public void exec( int opcode )
    {
        int opcode_val ;
        
        opcode_val = bounds.int_upper_limit( opcode, 0x100 ) ;

//        main_table.get( opcode_val ).execute( null ) ;

        main_table.get ( opcode ).execute ( null ) ;
        
        switch ( opcode )
        {
            case 0x00:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x01:  main_table.get( 0x00 ).execute( new String[]{ "BC", "nnnn" } ) ;
                        break ;
            case 0x02:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x03:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x04:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x05:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x06:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x07:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x08:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x09:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x0F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x10:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x11:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x12:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x13:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x14:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x15:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x16:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x17:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x18:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x19:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x1F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x20:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x21:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x22:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x23:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x24:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x25:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x26:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x27:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x28:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x29:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x2F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x30:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x31:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x32:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x33:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x34:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x35:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x36:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x37:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x38:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x39:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x3F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x40:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x41:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x42:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x43:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x44:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x45:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x46:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x47:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x48:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x49:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x4F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x50:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x51:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x52:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x53:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x54:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x55:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x56:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x57:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x58:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x59:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x5F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x60:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x61:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x62:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x63:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x64:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x65:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x66:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x67:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x68:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x69:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x6F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x70:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x71:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x72:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x73:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x74:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x75:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x76:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x77:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x78:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x79:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x7F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x80:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x81:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x82:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x83:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x84:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x85:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x86:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x87:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x88:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x89:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x8F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0x90:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x91:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x92:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x93:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x94:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x95:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x96:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x97:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x98:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x99:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9A:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9B:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9C:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9D:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9E:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0x9F:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xA0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xA9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAD:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xAF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xB0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xB9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBD:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xBF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xC0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xC9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCD:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xCF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xD0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xD9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDD:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xDF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xE0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xE9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xEA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xEB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xEC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xED:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xEE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xEF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;

            case 0xF0:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF1:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xf2:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF3:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF4:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF5:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF6:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF7:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF8:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xF9:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFA:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFB:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFC:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFD:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFE:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
            case 0xFF:  main_table.get( 0x00 ).execute( null ) ;
                        break ;
        }
    
    
    }
}
