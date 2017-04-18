/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bkj.banking;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Llaneras
 */
public class BankUnitTest {
    
    public BankUnitTest() {
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
    
    //public void addAccount() {
        
    //}
    class BankTest extends Bank {
    
        private String customerID;
        private String accountType;
        private double initialBalance;
        
        public BankTest(String name) {
            super(name);
        }   
        
        public void addAccount(String custID, String type, double initBal) {
            customerID = custID;
            accountType = type;
            initialBalance = initBal;
        }
        
        public void removeAccount(String custID) {
            customerID = custID;
            customerID = "0";
        }
        
        public List<Consumer> getCustomer(String lastName, String firstName) {
            Customer customer = new Customer("Like", "Mike");
            customer.getCustomerAccounts();
            return null;
        }
        
        public Accountable getAccount(String accountId) {
            Customer customer = new Customer("Like", "Mike");
            customer.getAccount(accountId);
            return null;
        }

        public String getCustomerID() {
            return customerID;
        }

        public String getAccountType() {
            return accountType;
        }

        public double getInitialBalance() {
            return initialBalance;
        }
    }
    
    @Test
    public void addAccountTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        Assert.assertEquals(bking.getCustomerID(), "123");
        Assert.assertEquals(bking.getAccountType(), "Checkings");
        Assert.assertFalse(bking.getInitialBalance() == 20000d);
    }
    
    @Test
    public void removeAccountTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        Assert.assertFalse(bking.customerID == "123");
        bking.removeAccount("123");
        Assert.assertFalse(bking.customerID == "0");
    }
    
    @Test
    public void getAccounts() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        Assert.assertFalse(bking.customerID == "123");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
    }
}