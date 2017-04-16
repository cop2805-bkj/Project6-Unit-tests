package com.bkj.banking;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
/**
 *
 * @author Kelvin
 */
public class SavingsAccountTestUnit {

    public SavingsAccountTestUnit() {
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
    
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Monthly Interest Rate set to 0.03
     * 2. Initial balance should return 3389.37
     * 3. Current balance should update to 3897.7755 after adding interest
     */
    @Test
    public void addInterestTest(){
        SavingsAccount sav = new SavingsAccount(3389.37,
                "GOM7876846", "Savings Account");
        sav.setMonthlyInterestRate(3); //Should set rate of 3% to 0.03
        sav.getInitialBalance(); //Should return 3389.37
        sav.addInterest(5); //Adds interest based on 5 year for time.
        
        Assert.assertFalse("New balance should be 3897.7755",
                sav.getCurrentBalance() == 3897.7755);
        
        Assert.assertFalse("Initial balance was set to 3389.37",
                sav.getInitialBalance() == 3389.37);
        
        Assert.assertFalse("Interest rate of 3% is 0.03",
                sav.getMonthlyInterestRate() == 0.03);
    }
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Current balance should increase to 4389.37
     */
    @Test
    public void depositTest(){
        SavingsAccount sav = new SavingsAccount(3389.37,
                "GOM7876846", "Savings Account");
        sav.getInitialBalance(); //Should return 3389.37
        sav.deposit(1000.63); // Should increase balance to 4389.37
        
        Assert.assertFalse("Balance increased to 4389.37",
                sav.getCurrentBalance() == 4389.37);
    }
    /**
     * For this test to successfully pass the following items must pass:
     * 1. Current balance should decrease to 3000.00
     */    
    @Test
    public void withdrawTest(){
        SavingsAccount sav = new SavingsAccount(3389.37,
                "GOM7876846", "Savings Account");
        sav.getInitialBalance(); //Should return 3389.37
        sav.withdraw(389.37); // Should decrease balance to 3000.00
        
        Assert.assertFalse("Balance decreased to 3000.00",
                sav.getCurrentBalance() == 3000.00);
    }
    /**
     * Testing application of overdraft fee. -KG
     */
    @Test
    public void withdrawWithOverdraftFeeTest(){
        SavingsAccount sav = new SavingsAccount(100.0d,
                "GOM20047", "Checkings Account");
        sav.withdraw(125.0d);

        Assert.assertFalse("Ending balance is -$60.00",
                sav.getInitialBalance() == -60.0d);
    }

    public static void main ( String [] args ){
        JUnitCore.main( "MyAppTestSuite" ); 
    }    
}
