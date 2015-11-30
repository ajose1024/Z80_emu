/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.sys ;

/**
 *
 * @author Utilizador
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
     * @param   value       (int)
     * @param   low_limit   (int)
     * @param   high_limit  (int)
     * @return              (int)
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
     * @param value
     * @param high_limit
     * @return 
     */
    public static final int int_upper_limit( int value, int top_limit )
    {
        return  Math.abs( value ) % top_limit ;
    }
}
