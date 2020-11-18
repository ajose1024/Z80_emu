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

package com.ajose_1024.z80_adm.z80_emu.tests;

import  com.ajose_1024.z80_adm.z80_cpu.registers.* ;


/**
 *
 * @author ADMIN
 */
public class register_tests
{
    
    /***********************
     * TEST Module CONSTANTS
     ***********************/
    
    // MIN_VAL (8 and 16 bit registers)
    private static final int MIN_VAL = 0 ;
    
    // MAX_VAL_8bit (8 bit registers)
    private static final int MAX_VAL_8bit = 255 ;
    
    // MAX_VAL_16bit (16 bit registers)
    private static final int MAX_VAL_16bit = 65535 ;
    
    // LOWER_LIMIT (8 bit and 16 bit registers)
    private static final int LOWER_LIMIT = 0 ;
    
    // UPPER_8bit_LIMIT (8 bit registers)
    private static final int UPPER_8bit_LIMIT = MAX_VAL_8bit + 2 ;
    
    // UPPER_16bit_limit (16 bit registers)
    private static final int UPPER_16bit_LIMIT = MAX_VAL_16bit + 2 ;
    
    // ODD_8bit_PATTERN (8 bit value)
    private static final int ODD_8bit_PATTERN = 0x55 ;
    
    // EVEN_8bit_PATTERN (8 bit value)
    private static final int EVEN_8bit_PATTERN = 0xAA ;
    
    // ODD_16bit_PATTERN (16 bit value)
    private static final int ODD_16bit_PATTERN = 0x5555 ;
    
    // EVEN_16bit_PATTERN (16 bit value)
    private static final int EVEN_16bit_PATTERN = 0xAAAA ;
    
    
    /**
     * Test_type ENUM
     * 
     * This ENUM defines the different type of test routines
     */
    public enum Test_type
    {
        LIMITS,         // This test stores and fetches a serie of limit values
        
        RUN,            // This test stores and fetches a series of values from
                        // 'lower_limit' up to 'upper_limit'
        
        EXCHANGE,       // This test stores a value in the normal register, and
                        // in the alternate register, and fetches and displays
                        // both
        
        RESET           // This test RESETs the value in the register an in the
                        // alternate register, setting both to 0
    }
    
    
    /**
     * A register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void A_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.A,
            "A"
        ) ;
    }
    
    
    /**
     * B register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void B_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.B,
            "B"
        ) ;
    }
    
    
    /**
     * C register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void C_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.C,
            "C"
        ) ;
    }
    
    
    /**
     * D register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void D_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.D,
            "D"
        ) ;
    }
    
    
    /**
     * E register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void E_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.E,
            "E"
        ) ;
    }
    
    
    /**
     * H register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void H_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.H,
            "H"
        ) ;
    }
    
    
    /**
     * L register test method
     * 
     * @param   test_type   (Test_type)
     */
    public static void L_reg_test( Test_type test_type )
    {
        register_tests.reg_test_8bit
        (
            test_type,
            z80_regs.L,
            "L"
        ) ;
    }
    
    


    /*******************
     * Private methods
     *******************/
    
        /**
     * A register test method
     * 
     * @param   test_type   (Test_type)
     */
    private static void reg_test_8bit(
                                        Test_type test_type,
                                        reg_8bit register,
                                        String reg_name
                                     )
    {
        switch ( test_type )
        {
            case LIMITS:
                System.out.println
                (
                    "Testing 8 bit " + reg_name + " register storage:  (LIMITS test) : \n"
                ) ;
                
                register_tests.LIMITS_test_8bit_reg
                (
                    register,
                    MIN_VAL,
                    MAX_VAL_8bit,
                    reg_name
                ) ;

                break ;

            case RUN:
                System.out.println
                (
                    "Testing 8 bit " + reg_name + " register storage:  (RUN test) : \n"
                ) ;
                
                register_tests.RUN_test_8bit_reg
                (
                    register,
                    LOWER_LIMIT,
                    UPPER_8bit_LIMIT,
                    reg_name
                ) ;

                break ;

            case EXCHANGE:
                System.out.println
                (
                    "Testing 8 bit " + reg_name + " register storage:  (EXCHANGE test) : \n" 
                ) ;
                
                register_tests.EXCHANGE_test_8bit_reg
                (
                    z80_regs.A,
                    ODD_8bit_PATTERN,
                    EVEN_8bit_PATTERN,
                    "A" ) ;

                break ;

            case RESET:
                System.out.println
                (
                    "Testing RESET of normal and alternate " + reg_name + " register"
                ) ;
                
                register_tests.RESET_test_8bit_reg
                (
                    register,
                    ODD_8bit_PATTERN,
                    EVEN_8bit_PATTERN,
                    reg_name
                ) ;

                break ;

            default:
                System.out.println( "INVALID OPTION!!!" ) ;

                break ;
        }
    }
    
    



    /**
     * Method:  test_reg_value( register, reg_value, reg_name )
     * 
     * This method prints the value of the register 'register', stores the value
     * 'reg_value' onto it and prints again the value of the reister 'register'
     * 
     * @param   register        (reg_8bit)
     * @param   lower_limit     (int)
     * @param   upper_limit     (int)
     * @param   reg_name        (String)
     */
    private static void test_8bit_reg_value( 
                                        reg_8bit register,
                                        int reg_value,
                                        String reg_name
                                       )
    {
        System.out.println(
                            "Reading value already in " +
                            reg_name + 
                            " register: " +
                            register.fetch( )
                          ) ;
        
        System.out.println(
                            "Storing " +
                            reg_value +
                            " into normal " + 
                            reg_name +
                            " register."
                          ) ;
        
        register.store( reg_value ) ;
        
        System.out.println(
                            "Reading value stored in " +
                            reg_name +
                            " register: " +
                            register.fetch( )
                          ) ;
    }


    /**
     * Method:  exchange_8bit_registers( register, reg_name )
     * 
     * This method prints a message informing the action being performed and
     * exchanges the normal register with the alternate register
     * 
     * @param   register        (reg_8bit)
     * @param   reg_name        (String)
     */
    private static void exchange_8bit_registers(
                                                    reg_8bit register,
                                                    String reg_name
                                               )
    {
        // EXCHANGE normal register WITH alternate register
        System.out.println( ) ;
        System.out.println(
                            "EXCHANGE normal " +
                            reg_name +
                            " register with alternate " +
                            reg_name +
                            " register."
                          ) ;
        System.out.println( ) ;
        
        register.exx_reg( ) ;
        
    }




    /**
     * Method:  LIMITS_test_8bit_reg( register, min_val, max_val, reg_name )
     * 
     * This method teste the storage of values in the register 'register' on the
     * value boundaries.
     * To do so, it reads and prints the value in the register, stores a new
     * value, and reads and prints that new value for the following values:
     * 
     *      ->  min_val -1
     *      ->  min_val
     *      ->  min_val + 1
     * 
     *      ->  max_val -1
     *      ->  max_val
     *      ->  max_val + 1
     * 
     * @param   register        (reg_8bit)
     * @param   min_val         (int)
     * @param   max_val         (int)
     * @param   reg_name        (String)
     */
    private static void LIMITS_test_8bit_reg(
                                                reg_8bit register,
                                                int min_val,
                                                int max_val, 
                                                String reg_name
                                            )
    {
        int[] test_values = new int[]{
                                        MIN_VAL - 1,
                                        MIN_VAL,
                                        MIN_VAL + 1,
                                        MAX_VAL_8bit - 1,
                                        MAX_VAL_8bit,
                                        MAX_VAL_8bit + 1
                                     } ;
    
        for( int test_byte_val : test_values )
        {
            System.out.println( "-------------------" ) ;
            System.out.println( "Testing with value: " + test_byte_val ) ;
            System.out.println( "------------------- " ) ;
            System.out.println( ) ;

            // Test normal register with value  min_val - 1
            register_tests.test_8bit_reg_value(
                                                                register,
                                                                test_byte_val,
                                                                reg_name
                                                            ) ;
            // Exchange normal register with alternate register
            register_tests.exchange_8bit_registers(
                                                                    register,
                                                                    reg_name
                                                                ) ;
            // Test normal register with value  min_val - 1
            register_tests.test_8bit_reg_value(
                                                                register,
                                                                test_byte_val,
                                                                reg_name
                                                            ) ;
            // Exchange normal register with alternate register
            register_tests.exchange_8bit_registers(
                                                                    register,
                                                                    reg_name
                                                                ) ;
        }
    }


    /**
     * Method:  RUN_test_8bit_reg( register, lower_limit, upper_limit, reg_name )
     * 
     * This method performs a counted loop between 'lower_limit' and 'upper_limit'
     * storing the counted value on the 'register' register and reading it afterwards
     * to show what was effectivelly stored.
     * 
     * @param   register    (reg_8bit)
     * @param   lower_limit (int)
     * @param   upper_limit (int)
     * @param   reg_name    (String)
     */
    private static void RUN_test_8bit_reg(
                                            reg_8bit register,
                                            int lower_limit,
                                            int upper_limit, 
                                            String reg_name
                                         )
    {
        for( int byte_val = lower_limit ; byte_val <= upper_limit ; byte_val++ )
        {
            System.out.print(
                                "Byte value: " +
                                byte_val +
                                " --> "
                            ) ;
            register.store( byte_val ) ;
            System.out.print(
                                "Stored " +
                                byte_val +
                                " in " +
                                reg_name +
                                " register --> "
                            ) ;
            int read_byte_val = register.fetch( ) ;
            System.out.print(
                                "Read: " +
                                register.fetch( ) +
                                " from " +
                                reg_name +
                                " register.  Done."
                            ) ;
            System.out.println( ) ;
        }
    }


    /**
     * Method:  EXCHANGE_test_8bit_reg( register, normal_reg_value,
     *                                  alt_reg_value, reg_name )
     * 
     * This method performs a test of the normal and alternate register.
     * The testes performed are as follows:
     * 
     *      ->  Read value in the normal register and print it
     *      ->  Store 'normal_reg_value' in the normal register
     *      ->  Read again the value in the normal register and print it.
     *      ->  Exchange normal register with alternate register
     *      ->  Read value in the alternate register and print it.
     *      ->  Store 'alt_reg_value' in the alternate register
     *      ->  Read again the value in the alternate register and print it.
     *      ->  Exchange alternate register with normal register
     *      ->  Read value in the normal register and print it
     *      ->  Exchange normal register with alternate register
     *      ->  Read value in the alternate register and print it
     *      ->  Exchange alternate register with normal register
     *      ->  Reset the normal and alternate registers
     *      ->  Read value in the normal register and print it
     *      ->  Exchange normal register with alternate register
     *      ->  Read value in the alternate register and print it
     *      ->  Exchange alternate register with normal register
     * 
     * @param   register            (reg_8bit)
     * @param   normal_reg_value    (int)
     * @param   alt_reg_value       (int)
     * @param   reg_name            (String)
     */
    private static void EXCHANGE_test_8bit_reg(
                                                reg_8bit register,
                                                int normal_reg_value,
                                                int alt_reg_value, 
                                                String reg_name
                                              )
    {
        register_tests.test_8bit_reg_value(
                                                        register,
                                                        normal_reg_value,
                                                        reg_name
        ) ;
        
        register_tests.exchange_8bit_registers(
                                                                register,
                                                                reg_name
                                                            );
        
        register_tests.test_8bit_reg_value(
                                                        register,
                                                        alt_reg_value,
                                                        reg_name
        ) ;
        
        register_tests.exchange_8bit_registers(
                                                                register,
                                                                reg_name
                                                            );
        
        System.out.println(
                            "Reading value stored in normal " +
                            reg_name +
                            " register: " +
                            register.fetch( )
                          ) ;
        
        register.exx_reg( ) ;
        
        System.out.println(
                            "Reading value stored in alterante " +
                            reg_name +
                            " register: " +
                            register.fetch( )
                          ) ;
        
        register.exx_reg( ) ;
        
        register_tests.RESET_test_8bit_reg
        (
            register,
            ODD_8bit_PATTERN,
            EVEN_8bit_PATTERN,
            reg_name
        ) ;
    }


    /**
     * Method:  RESET_test_8bit_reg( register, normal_reg_value,
     *                               alt_reg_value, reg_name )
     * 
     * This method RESETs both the normal and alternate register, setting both
     * to the value 0.
     * 
     * @param   register            (reg_8bit)
     * @param   normal_reg_value    (int)
     * @param   alt_reg_value       (int)
     * @param   reg_name            (String)
     */
    private static void RESET_test_8bit_reg(
                                                reg_8bit register,
                                                int normal_reg_value,
                                                int alt_reg_value, 
                                                String reg_name
                                           )
    {
        // RESET normal and alternate register
        System.out.println( ) ;
        System.out.println(
                            "RESET normal " +
                            reg_name +
                            " register and alternate " +
                            reg_name +
                            " register." ) ;
        System.out.println( ) ;
        
        register.reset( ) ;
        
        System.out.println(
                            "Reading reseted value in normal " +
                            reg_name +
                            " register: " +
                            register.fetch( )
                          ) ;
        
        register.exx_reg( ) ;
        
        System.out.println(
                            "Reading reseted value in alterante " +
                            reg_name +
                            " register: " +
                            register.fetch( )
                          ) ;
        
        register.exx_reg( ) ;
        
    }

}