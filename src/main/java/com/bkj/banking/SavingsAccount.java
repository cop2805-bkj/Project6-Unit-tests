package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 * Modified by Kelvin on 4/10/2017
 */

/**
 * Class SavingsAccount is an Account, but includes monthly interest payments.
 */
public class SavingsAccount extends Account {
 
    /**
     * Create a new savings account
     *
     * @param initialBalance
     * @param customerId
     * @param accountDescription
     */
    SavingsAccount (double initialBalance, String customerId, String accountDescription) {
        
    }
    /**
     * Adds a transaction "INTEREST PAYMENT" based on this accounts monthly interest rate.
     */
    void addInterest(){

    }
    /**
     * Add money into account
     *
     * @param amount
     */
    @Override
    public void deposit(double amount) {
        
    }
    /**
     * remove money from account
     *
     * @param amount
     */
    @Override
    public void withdraw(double amount) {

    }
    /**
     * Transfer funds between two accounts of a single customer. -KG
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
    public void transfer(Account fromAccount, Account toAccount, double amount){
        
    }
}
