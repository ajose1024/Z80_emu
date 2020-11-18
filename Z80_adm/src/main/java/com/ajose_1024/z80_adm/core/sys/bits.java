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
 *  Class:  bits
 * 
 *  This ENUM class allows to refer a bit by bit name and get it's value and
 *  it's name as a string.
 *
 *  @Type:  ENUM
 * 
 *  @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */

public enum bits
{
    bit_0   ( 1L                    , "bit_0" ),    // Value:                     1
    bit_1   ( 2                     , "bit_1" ),    // Value:                     2
    bit_2   ( 4                     , "bit_2" ),    // Value:                     4
    bit_3   ( 8                     , "bit_3" ),    // Value:                     8
    bit_4   ( 16                    , "bit_4" ),    // Value:                    16
    bit_5   ( 32                    , "bit_5" ),    // Value:                    32
    bit_6   ( 64                    , "bit_6" ),    // Value:                    64
    bit_7   ( 128                   , "bit_7" ),    // Value:                   128
    bit_8   ( 256                   , "bit_8" ),    // Value:                   256
    bit_9   ( 512                   , "bit_9" ),    // Value:                   512
    bit_10  ( 1024                  , "bit_10" ),   // Value:                  1024
    bit_11  ( 2048                  , "bit_11" ),   // Value:                  2048
    bit_12  ( 4096                  , "bit_12" ),   // Value:                  4096
    bit_13  ( 8192                  , "bit_13" ),   // Value:                  8192
    bit_14  ( 16384                 , "bit_14" ),   // Value:                 16384
    bit_15  ( 32768                 , "bit_15" ),   // Value:                 32768
    bit_16  ( 65536                 , "bit_16" ),   // Value:                 65536
    bit_17  ( 131072                , "bit_17" ),   // Value:                131072
    bit_18  ( 262144                , "bit_18" ),   // Value:                262144
    bit_19  ( 524288                , "bit_19" ),   // Value:                524288
    bit_20  ( 1048576               , "bit_20" ),   // Value:               1048576
    bit_21  ( 2097152               , "bit_21" ),   // Value:               2097152
    bit_22  ( 4194304               , "bit_22" ),   // Value:               4194304
    bit_23  ( 8388608               , "bit_23" ),   // Value:               8388608
    bit_24  ( 16777216              , "bit_24" ),   // Value:              16777216
    bit_25  ( 33554432              , "bit_25" ),   // Value:              33554432
    bit_26  ( 67108864L             , "bit_26" ),   // Value:              67108864
    bit_27  ( 134217728L            , "bit_27" ),   // Value:             134217728
    bit_28  ( 268435456L            , "bit_28" ),   // Value:             268435456
    bit_29  ( 536870912L            , "bit_29" ),   // Value:             536870912
    bit_30  ( 1073741824L           , "bit_30" ),   // Value:            1073741824
    bit_31  ( 2147483648L           , "bit_31" ),   // Value:            2147483648
    bit_32  ( 4294967296L           , "bit_32" ),   // Value:            4294967296
    bit_33  ( 8589934592L           , "bit_33" ),   // Value:            8589934592
    bit_34  ( 17179869184L          , "bit_34" ),   // Value:           17179869184
    bit_35  ( 34359738368L          , "bit_35" ),   // Value:           34359738368
    bit_36  ( 137438953472L         , "bit_36" ),   // Value:          137438953472
    bit_37  ( 274877906944L         , "bit_37" ),   // Value:          274877906944
    bit_38  ( 549755813888L         , "bit_38" ),   // Value:          549755813888
    bit_39  ( 1099511627776L        , "bit_39" ),   // Value:         1099511627776
    bit_40  ( 2199023255552L        , "bit_40" ),   // Value:         2199023255552
    bit_41  ( 4398046511104L        , "bit_41" ),   // Value:         4398046511104
    bit_42  ( 8796093022208L        , "bit_42" ),   // Value:         8796093022208
    bit_43  ( 17592186044416L       , "bit_43" ),   // Value:        17592186044416
    bit_44  ( 35184372088832L       , "bit_44" ),   // Value:        35184372088832
    bit_45  ( 70368744177664L       , "bit_45" ),   // Value:        70368744177664
    bit_46  ( 140737488355328L      , "bit_46" ),   // Value:       140737488355328
    bit_47  ( 281474976710656L      , "bit_47" ),   // Value:       281474976710656
    bit_48  ( 562949953421312L      , "bit_48" ),   // Value:       562949953421312
    bit_49  ( 1125899906842624L     , "bit_49" ),   // Value:      1125899906842624
    bit_50  ( 2251799813685248L     , "bit_50" ),   // Value:      2251799813685248
    bit_51  ( 4503599627370496L     , "bit_51" ),   // Value:      4503599627370496
    bit_52  ( 9007199254740992L     , "bit_52" ),   // Value:      9007199254740992
    bit_53  ( 18014398509481984L    , "bit_53" ),   // Value:     18014398509481984
    bit_54  ( 36028797018963968L    , "bit_54" ),   // Value:     36028797018963968
    bit_55  ( 72057594037927936L    , "bit_55" ),   // Value:     72057594037927936
    bit_56  ( 144115188075855872L   , "bit_56" ),   // Value:    144115188075855872
    bit_57  ( 288230376151711744L   , "bit_57" ),   // Value:    288230376151711744
    bit_58  ( 576460752303423488L   , "bit_58" ),   // Value:    576460752303423488
    bit_59  ( 1152921504606846976L  , "bit_59" ),   // Value:   1152921504606846976
    bit_60  ( 2305843009213693952L  , "bit_60" ),   // Value:   2305843009213693952
    bit_61  ( 4611686018427387904L  , "bit_61" ),   // Value:   4611686018427387904
    ;
    
    /**
     *  Property:   bit_value
     *
     *  This private property holds the bit value during the dynamic ENUM object
     *  instatialization.
     */
    private final long bit_value ;
    
    /**
     *  Property:   bit_name
     *  
     *  This private property holds the bit name during the dynamic ENUM object
     *  instatializtion.
     */
    private final String bit_name ;
    
    
    /**
     *  Constructor:    bits
     *
     *  This is the constructor that builds the dynamic ENUM object on the fly.
     * 
     *  @return     Object
     */
    private bits( long bit_value, String bit_name )
    {
        this.bit_value = bit_value ;
        this.bit_name  = bit_name ;
    }
    
    
    /**
     *  Method:     bit_value
     *  
     *  This method returns the value of the bit.
     * 
     *  @return     int         bit_value
     */
    public long bit_value()
    {
        return bit_value;
    }

    
    /**
     *  Method:     bit_name
     *  
     *  This method returns the name of the bit.
     * 
     *  @return     String      bit_name
     */
    public String bit_name()
    {
        return  bit_name ;
    }
    
}
 
    