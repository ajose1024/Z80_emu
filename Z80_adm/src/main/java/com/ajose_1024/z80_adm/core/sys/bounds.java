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

package com.ajose_1024.z80_adm.core.sys ;

/**
 * Class:   bounds
 * 
 * This class is used to test is a parameter is within giving bounds
 * 
 * @Type:   Normal Class
 * 
 * @author Antonio Jose Gomes <ajose.gomes@ajgomes.datanet-pt.net>
 */
public class bounds
{
    /**
     * Method:  int_range_bound( value, low_limit, high_limit )
     * 
     * This method tests if the value in the 'value' parameter is within the
     * lower limit 'low_limit' and the upper limit 'high_limit'.
     * 
     * If it is lower than 'low_limit' it returns 'low_limit'.
     * If it is higher than the 'hugh_limit' it returns 'high_limit'
     * 
     * @param       (int)       value
     * @param       (int)       low_limit
     * @param       (int)       high_limit
     * 
     * @return      (int)
     */
    public static final int int_range_bound( int value, int low_limit, int high_limit )
    {
        int work_val = value ;
        
        if( work_val < low_limit )
        {
            return  low_limit ;
        }
        else if( high_limit > work_val )
        {
            return  high_limit ;
        }
        else
        {
            return  work_val ;
        }
    }
    
    /**
     * Method:  int_upper_limit( value, top_limit )
     * 
     * This method returns the value in 'value' bounded to the limits of 0 and
     * top_limit - 1
     * 
     * @param       (int)       value
     * @param       (int)       high_limit
     * 
     * @return      (int)
     */
    public static final int int_upper_limit( int value, int top_limit )
    {
        return  Math.abs( value ) % top_limit ;
    }
}
