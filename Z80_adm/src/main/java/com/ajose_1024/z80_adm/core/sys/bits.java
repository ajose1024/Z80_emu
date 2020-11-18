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

package com.ajose_1024.z80_adm.core.sys;

/**
 *
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public enum bits
{
    bit_0   ( 1L          , "bit_0" ),  // Value:          1
    bit_1   ( 2           , "bit_1" ),  // Value:          2
    bit_2   ( 4           , "bit_2" ),  // Value:          4
    bit_3   ( 8           , "bit_3" ),  // Value:          8
    bit_4   ( 16          , "bit_4" ),  // Value:         16
    bit_5   ( 32          , "bit_5" ),  // Value:         32
    bit_6   ( 64          , "bit_6" ),  // Value:         64
    bit_7   ( 128         , "bit_7" ),  // Value:        128
    bit_8   ( 256         , "bit_8" ),  // Value:        256
    bit_9   ( 512         , "bit_9" ),  // Value:        512
    bit_10  ( 1024        , "bit_10" ), // Value:       1024
    bit_11  ( 2048        , "bit_11" ), // Value:       2048
    bit_12  ( 4096        , "bit_12" ), // Value:       4096
    bit_13  ( 8192        , "bit_13" ), // Value:       8192
    bit_14  ( 16384       , "bit_14" ), // Value:      16384
    bit_15  ( 32768       , "bit_15" ), // Value:      32768
    bit_16  ( 65536       , "bit_16" ), // Value:      65536
    bit_17  ( 131072      , "bit_17" ), // Value:     131072
    bit_18  ( 262144      , "bit_18" ), // Value:     262144
    bit_19  ( 524288      , "bit_19" ), // Value:     524288
    bit_20  ( 1048576     , "bit_20" ), // Value:    1048576
    bit_21  ( 2097152     , "bit_21" ), // Value:    2097152
    bit_22  ( 4194304     , "bit_22" ), // Value:    4194304
    bit_23  ( 8388608     , "bit_23" ), // Value:    8388608
    bit_24  ( 16777216    , "bit_24" ), // Value:   16777216
    bit_25  ( 33554432    , "bit_25" ), // Value:   33554432
    bit_26  ( 67108864L   , "bit_26" ), // Value:   67108864
    bit_27  ( 134217728L  , "bit_27" ), // Value:  134217728
    bit_28  ( 268435456L  , "bit_28" ), // Value:  268435456
    bit_29  ( 536870912L  , "bit_29" ), // Value:  536870912
    bit_30  ( 1073741824L , "bit_30" ), // Value: 1073741824
    bit_31  ( 2147483648L , "bit_31" ), // Value: 2147483648
    bit_32  ( 4294967296L , "bit_32" ), // Value: 4294967296
    ;
    
    private final long bit_value ;
    private final String bit_name ;
    
    private bits( long bit_value, String bit_name )
    {
        this.bit_value = bit_value ;
        this.bit_name  = bit_name ;
    }
    
    
    public long bit_value()
    {
        return bit_value;
    }

    
    public String bit_name()
    {
        return  bit_name ;
    }
    
}
 
    