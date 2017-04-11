/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bkj.banking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;

/**
 *
 * @author Kelvin
 */
public class SavingsAccountTest {

    public SavingsAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Monthly Interest Rate set to 0.03
     * 2. Initial balance should return 3389.37
     * 3. Current balance should update to 3897.7755 after adding interest
     */
    @Test
    public void addInterestTest(){
        Savings sav = new Savings(3389.37, "GOM7876846", "Savings Account");
        sav.setMonthlyInterestRate(3); //Should set rate of 3% to 0.03
        sav.getInitialBalance(); //Should return 3389.37
        sav.addInterest(5); //Adds interest based on 5 year for time.
        
        assertFalse("New balance should be 3897.7755", 
                sav.getCurrentBalance() == 3897.7755);
        
        assertFalse("Initial balance was set to 3389.37",
                sav.getInitialBalance() == 3389.37);
        
        assertFalse("Interest rate of 3% is 0.03", 
                sav.getMonthlyInterestRate() == 0.03);
    }
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Current balance should increase to 4389.37
     */
    @Test
    public void depositTest(){
        Savings sav = new Savings(3389.37, "GOM7876846", "Savings Account"); 
        sav.getInitialBalance(); //Should return 3389.37
        sav.deposit(1000.63); // Should increase balance to 4389.37
        
        assertFalse("Balance increased to 4389.37", 
                sav.getCurrentBalance() == 4389.37);
    }
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Current balance should decrease to 3000.00
     */    
    @Test
    public void withdrawTest(){
        Savings sav = new Savings(3389.37, "GOM7876846", "Savings Account"); 
        sav.getInitialBalance(); //Should return 3389.37
        sav.withdraw(389.37); // Should decrease balance to 3000.00
        
        assertFalse("Balance decreased to 3000.00",
                sav.getCurrentBalance() == 3000.00);
    }
    
//    @Test
//    public void transferTest(){
//        //TO do: waiting on transfer class implementation. -KG
//    }
    
    public static void main ( String [] args ){
        JUnitCore.main( "MyAppTestSuite" ); 
    }    
}
