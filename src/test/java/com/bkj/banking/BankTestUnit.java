/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bkj.banking;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

/**
 *
 * @author Jonathan Llaneras
 */
public class BankTestUnit {
    
    public BankTestUnit() {
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
        
        public void getAccounts() {
            Customer customer = new Customer("Like", "Mike");
            customer.getCustomerAccounts();
        }
        
        public Accountable getAccount(String accountId) {
            Customer customer = new Customer("Like", "Mike");
            customer.getAccount(accountId);
            return null;
        }
        
        public void addCustomer() {
            Customer customer = new Customer("Like", "Mike");
            customer.getCustomerAccounts();
        }
        
        public void removeCustomer(String customerId) {
            Customer customer = new Customer("Like", "Mike");
            try {
                customer.removeAccount(customerId);
            } catch (Exception ex) {
                Logger.getLogger(BankTestUnit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void getCustomers() {
            Customer customer = new Customer("Like", "Mike");
            customer.getCustomerAccounts();
        }
        
        public Consumer getCustomer(String customerId) {
            Customer customer = new Customer("Like", "Mike");
            customer.getAccount("123");
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
    public void getAccountsTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        bking.addAccount("1234", "Checkings", 20000d);
        bking.addAccount("12345", "Savings", 30000d);
        Assert.assertFalse(bking.customerID == "123");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
        Assert.assertFalse(bking.customerID == "1234");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
        Assert.assertFalse(bking.customerID == "12345");
        Assert.assertFalse(bking.accountType == "Savings");
        Assert.assertFalse(bking.initialBalance == 30000d);
    }
    
    public void getAccountTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        Assert.assertFalse(bking.customerID == "123");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
    }
    
    public void addCustomerTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        bking.getCustomerID();
        Assert.assertFalse(bking.customerID == "123");
    }
    
    public void removeCustomerTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        bking.getCustomerID();
        Assert.assertFalse(bking.customerID == "0");
    }
    
    public void getCustomersAccountsTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        bking.addAccount("1234", "Checkings", 20000d);
        bking.addAccount("12345", "Savings", 30000d);
        bking.getAccounts();
        Assert.assertFalse(bking.customerID == "123");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
        Assert.assertFalse(bking.customerID == "1234");
        Assert.assertFalse(bking.accountType == "Checkings");
        Assert.assertFalse(bking.initialBalance == 20000d);
        Assert.assertFalse(bking.customerID == "12345");
        Assert.assertFalse(bking.accountType == "Savings");
        Assert.assertFalse(bking.initialBalance == 30000d);
    }
    
    public void getCustomerTest() {
        BankTest bking = new BankTest("Chase");
        bking.addAccount("123", "Checkings", 20000d);
        bking.getAccount("123");
        Assert.assertFalse(bking.customerID == "123");
    }
    
    public static void main(String[] args){
        JUnitCore.main("MyAppTestSuite");
    }
}