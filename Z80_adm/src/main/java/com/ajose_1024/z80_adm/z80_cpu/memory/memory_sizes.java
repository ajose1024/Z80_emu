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

package com.ajose_1024.z80_adm.z80_cpu.memory;

/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class memory_sizes
{
    public enum mem
    {
        size_1k,        //  1k byte memory
        size_2k,        //  2k byte memory
        size_3k,        //  3k byte memory
        size_4k,        //  4k byte memory
        size_5k,        //  5k byte memory
        size_6k,        //  6k byte memory
        size_7k,        //  7k byte memory
        size_8k,        //  8k byte memory
        size_9k,        //  9k byte memory
        size_10k,       // 10k byte memory
        size_11k,       // 11k byte memory
        size_12k,       // 12k byte memory
        size_13k,       // 13k byte memory
        size_14k,       // 14k byte memory
        size_15k,       // 15k byte memory
        size_16k,       // 16k byte memory
        size_17k,       // 17k byte memory
        size_18k,       // 18k byte memory
        size_19k,       // 19k byte memory
        size_20k,       // 20k byte memory
        size_21k,       // 21k byte memory
        size_22k,       // 22k byte memory
        size_23k,       // 23k byte memory
        size_24k,       // 24k byte memory
        size_25k,       // 25k byte memory
        size_26k,       // 26k byte memory
        size_27k,       // 27k byte memory
        size_28k,       // 28k byte memory
        size_29k,       // 29k byte memory
        size_30k,       // 30k byte memory
        size_31k,       // 31k byte memory
        size_32k,       // 32k byte memory
        size_33k,       // 33k byte memory
        size_34k,       // 34k byte memory
        size_35k,       // 35k byte memory
        size_36k,       // 36k byte memory
        size_37k,       // 37k byte memory
        size_38k,       // 38k byte memory
        size_39k,       // 39k byte memory
        size_40k,       // 40k byte memory
        size_41k,       // 41k byte memory
        size_42k,       // 42k byte memory
        size_43k,       // 43k byte memory
        size_44k,       // 44k byte memory
        size_45k,       // 45k byte memory
        size_46k,       // 46k byte memory
        size_47k,       // 47k byte memory
        size_48k,       // 48k byte memory
        size_49k,       // 49k byte memory
        size_50k,       // 50k byte memory
        size_51k,       // 51k byte memory
        size_52k,       // 52k byte memory
        size_53k,       // 53k byte memory
        size_54k,       // 54k byte memory
        size_55k,       // 55k byte memory
        size_56k,       // 56k byte memory
        size_57k,       // 57k byte memory
        size_58k,       // 58k byte memory
        size_59k,       // 59k byte memory
        size_60k,       // 60k byte memory
        size_61k,       // 61k byte memory
        size_62k,       // 62k byte memory
        size_63k,       // 63k byte memory
        size_64k        // 64k byte memory
    } ;
    
    public static int get_mem_size( mem mem_size )
    {
        switch ( mem_size )
        {
            case size_1k :
                return  1 * 1024 ;
                
            case size_2k :
                return  2 * 1024 ;
                
            case size_3k :
                return  3 * 1024 ;
                
            case size_4k :
                return  4 * 1024 ;
                
            case size_5k :
                return  5 * 1024 ;
                
            case size_6k :
                return  6 * 1024 ;
                
            case size_7k :
                return  7 * 1024 ;
                
            case size_8k :
                return  8 * 1024 ;
                
            case size_9k :
                return  9 * 1024 ;
                
            case size_10k :
                return  10 * 1024 ;
                
            case size_11k :
                return  11 * 1024 ;
                
            case size_12k :
                return  12 * 1024 ;
                
            case size_13k :
                return  13 * 1024 ;
                
            case size_14k :
                return  14 * 1024 ;
                
            case size_15k :
                return  15 * 1024 ;
                
            case size_16k :
                return  16 * 1024 ;
                
            case size_17k :
                return  17 * 1024 ;
                
            case size_18k :
                return  18 * 1024 ;
                
            case size_19k :
                return  19 * 1024 ;
                
            case size_20k :
                return  20 * 1024 ;
                
            case size_21k :
                return  21 * 1024 ;
                
            case size_22k :
                return  22 * 1024 ;
                
            case size_23k :
                return  23 * 1024 ;
                
            case size_24k :
                return  24 * 1024 ;
                
            case size_25k :
                return  25 * 1024 ;
                
            case size_26k :
                return  26 * 1024 ;
                
            case size_27k :
                return  27 * 1024 ;
                
            case size_28k :
                return  28 * 1024 ;
                
            case size_29k :
                return  29 * 1024 ;
                
            case size_30k :
                return  30 * 1024 ;
                
            case size_31k :
                return  31 * 1024 ;
                
            case size_32k :
                return  32 * 1024 ;
                
            case size_33k :
                return  33 * 1024 ;
                
            case size_34k :
                return  34 * 1024 ;
                
            case size_35k :
                return  35 * 1024 ;
                
            case size_36k :
                return  36 * 1024 ;
                
            case size_37k :
                return  37 * 1024 ;
                
            case size_38k :
                return  38 * 1024 ;
                
            case size_39k :
                return  39 * 1024 ;
                
            case size_40k :
                return  40 * 1024 ;
                
            case size_41k :
                return  41 * 1024 ;
                
            case size_42k :
                return  42 * 1024 ;
                
            case size_43k :
                return  43 * 1024 ;
                
            case size_44k :
                return  44 * 1024 ;
                
            case size_45k :
                return  45 * 1024 ;
                
            case size_46k :
                return  46 * 1024 ;
                
            case size_47k :
                return  47 * 1024 ;
                
            case size_48k :
                return  48 * 1024 ;
                
            case size_49k :
                return  49 * 1024 ;
                
            case size_50k :
                return  50 * 1024 ;
                
            case size_51k :
                return  51 * 1024 ;
                
            case size_52k :
                return  52 * 1024 ;
                
            case size_53k :
                return  53 * 1024 ;
                
            case size_54k :
                return  54 * 1024 ;
                
            case size_55k :
                return  55 * 1024 ;
                
            case size_56k :
                return  56 * 1024 ;
                
            case size_57k :
                return  57 * 1024 ;
                
            case size_58k :
                return  58 * 1024 ;
                
            case size_59k :
                return  59 * 1024 ;
                
            case size_60k :
                return  60 * 1024 ;
                
            case size_61k :
                return  61 * 1024 ;
                
            case size_62k :
                return  62 * 1024 ;
                
            case size_63k :
                return  63 * 1024 ;
                
            case size_64k :
                return  64 * 1024 ;
                
            default:
                return 0 ;
        }
    }
}
