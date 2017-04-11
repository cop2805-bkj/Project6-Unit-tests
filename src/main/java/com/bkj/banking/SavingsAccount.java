package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 */

/**
 * Class SavingsAccount is an Account, but includes monthly interest payments.
 */
public class SavingsAccount extends Account {
    /**
     * Class properties. -KG
     */
    private double monthlyInterestRate;
    private double balance;
    private String customerId;
    private String description;
    
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
     * BEGIN: Getter and setters. -KG
     *
     */
    
    /**
     * Gets monthly Interest Rate. -KG
     * @return 
     */
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    
    /**
     * Sets Interest Rate. -KG
     * @param monthlyInterestRate 
     */
    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    /**
     * Gets Balance. -KG
     * @return 
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Sets Balance. -KG
     * @param balance 
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * Gets Customer ID. -KG
     * @return 
     */
    public String getCustomerId() {
        return customerId;
    }
    
    /**
     * Sets Customer ID. -KG
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    /**
     * Gets account description. -KG
     * @return 
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets account description. -KG
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * END: Getter and setters. -KG
     */


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
    
    /**
     * toString Override to display customer details. -KG
     * @return 
     */
    @Override
    public String toString(){
        return null;
    }
}
