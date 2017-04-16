/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bkj.banking;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
/**
 *
 * @author Kelvin
 */
public class CheckingsAccountTestUnit {

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
    
    /**
     * Testing application of withdraw fee. -KG
     */
    @Test
    public void applyFeeForWithdrawlTest(){
        CheckingAccount ck = new CheckingAccount(100.0d, 
                "GOM20047", "Checkings Account");
        ck.withdraw(72.0d);
        
        Assert.assertFalse("Ending balance is be $25.00",
                ck.getInitialBalance() == 25.0d);
    }
    /**
     * Testing application of withdraw and overdraft fee. -KG
     */
    @Test
    public void applyFeeForOverdraftTest(){
        CheckingAccount ck = new CheckingAccount(100.0d, 
                "GOM20047", "Checkings Account");
        ck.withdraw(101.0d);
        
        Assert.assertFalse("Ending balance is -$39.00",
                ck.getInitialBalance() == (-39.0d));
    }
    /**
     * Testing adding money to the account. -KG
     */
    @Test
    public void depositTest(){
        CheckingAccount ck = new CheckingAccount(100.0d, 
                "GOM20047", "Checkings Account");
        ck.deposit(250.0d);
        
        Assert.assertFalse("Ending balance is be $350.00",
                ck.getInitialBalance() == 350.0d);
    }
    /**
     * Testing removing money from the account. KG
     */
    @Test
    public void withdrawTest(){
        CheckingAccount ck = new CheckingAccount(100.0d, 
                "GOM20047", "Checkings Account");
        ck.withdraw(35.0d);
        
        Assert.assertFalse("Ending balance is $65.00", ck.getInitialBalance() == 65.0d);
    }
    /**
     * Testing application of overdraft fee. -KG
     */
    @Test
    public void withdrawWithOverdraftFeeTest(){
        CheckingAccount ck = new CheckingAccount(100.0d, 
                "GOM20047", "Checkings Account");
        ck.withdraw(125.0d);
        
        Assert.assertFalse("Ending balance is -$60.00",
                ck.getInitialBalance() == -60.0d);
    }
    
    public static void main(String[] args){
        JUnitCore.main("MyAppTestSuite");
    }
}
