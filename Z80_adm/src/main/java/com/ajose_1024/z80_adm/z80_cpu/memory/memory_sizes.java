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
public enum memory_sizes
{
        size_1k  (  1024,  "1K" ),      //  1k byte memory
        size_2k  (  2048,  "2K" ),      //  2k byte memory
        size_3k  (  3072,  "3K" ),      //  3k byte memory
        size_4k  (  4096,  "4K" ),      //  4k byte memory
        size_5k  (  5120,  "5K" ),      //  5k byte memory
        size_6k  (  6144,  "6K" ),      //  6k byte memory
        size_7k  (  7168,  "7K" ),      //  7k byte memory
        size_8k  (  8192,  "8K" ),      //  8k byte memory
        size_9k  (  9216,  "9K" ),      //  9k byte memory
        size_10k ( 10240, "10K" ),      // 10k byte memory
        size_11k ( 11264, "11K" ),      // 11k byte memory
        size_12k ( 12288, "12K" ),      // 12k byte memory
        size_13k ( 13312, "13K" ),      // 13k byte memory
        size_14k ( 14336, "14K" ),      // 14k byte memory
        size_15k ( 15360, "15K" ),      // 15k byte memory
        size_16k ( 16384, "16K" ),      // 16k byte memory
        size_17k ( 17408, "17K" ),      // 17k byte memory
        size_18k ( 18432, "18K" ),      // 18k byte memory
        size_19k ( 19456, "19K" ),      // 19k byte memory
        size_20k ( 20480, "20K" ),      // 20k byte memory
        size_21k ( 21504, "21K" ),      // 21k byte memory
        size_22k ( 22528, "22K" ),      // 22k byte memory
        size_23k ( 23552, "23K" ),      // 23k byte memory
        size_24k ( 24576, "24K" ),      // 24k byte memory
        size_25k ( 25600, "25K" ),      // 25k byte memory
        size_26k ( 26624, "26K" ),      // 26k byte memory
        size_27k ( 27648, "27K" ),      // 27k byte memory
        size_28k ( 28672, "28K" ),      // 28k byte memory
        size_29k ( 29696, "29K" ),      // 29k byte memory
        size_30k ( 30720, "30K" ),      // 30k byte memory
        size_31k ( 31744, "31K" ),      // 31k byte memory
        size_32k ( 32768, "32K" ),      // 32k byte memory
        size_33k ( 33792, "33K" ),      // 33k byte memory
        size_34k ( 34816, "34K" ),      // 34k byte memory
        size_35k ( 35840, "35K" ),      // 35k byte memory
        size_36k ( 36864, "36K" ),      // 36k byte memory
        size_37k ( 37888, "37K" ),      // 37k byte memory
        size_38k ( 38912, "38K" ),      // 38k byte memory
        size_39k ( 39936, "39K" ),      // 39k byte memory
        size_40k ( 40960, "40K" ),      // 40k byte memory
        size_41k ( 41984, "41K" ),      // 41k byte memory
        size_42k ( 43008, "42K" ),      // 42k byte memory
        size_43k ( 44032, "43K" ),      // 43k byte memory
        size_44k ( 45056, "44K" ),      // 44k byte memory
        size_45k ( 46080, "45K" ),      // 45k byte memory
        size_46k ( 47104, "46K" ),      // 46k byte memory
        size_47k ( 48128, "47K" ),      // 47k byte memory
        size_48k ( 49152, "48K" ),      // 48k byte memory
        size_49k ( 50176, "49K" ),      // 49k byte memory
        size_50k ( 51200, "50K" ),      // 50k byte memory
        size_51k ( 52224, "51K" ),      // 51k byte memory
        size_52k ( 53248, "52K" ),      // 52k byte memory
        size_53k ( 54272, "53K" ),      // 53k byte memory
        size_54k ( 55296, "54K" ),      // 54k byte memory
        size_55k ( 56320, "55K" ),      // 55k byte memory
        size_56k ( 57344, "56K" ),      // 56k byte memory
        size_57k ( 58368, "57K" ),      // 57k byte memory
        size_58k ( 59392, "58K" ),      // 58k byte memory
        size_59k ( 60416, "59K" ),      // 59k byte memory
        size_60k ( 61440, "60K" ),      // 60k byte memory
        size_61k ( 62464, "61K" ),      // 61k byte memory
        size_62k ( 63488, "62K" ),      // 62k byte memory
        size_63k ( 64512, "63K" ),      // 63k byte memory
        size_64k ( 65536, "64K" ),      // 64k byte memory
        ;
        
        
        private final int mem_size_value ;
        
        private final String mem_size_name ;
        
        private memory_sizes( int mem_size_value, String mem_size_name )
        {
            this.mem_size_value = mem_size_value ;
            this.mem_size_name  = mem_size_name ;
        }
        
        public int value()
        {
            return  this.mem_size_value ;
        }
        
        public String size_name()
        {
            return  this.mem_size_name ;
        }
}
