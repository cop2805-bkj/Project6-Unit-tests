package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 * Modified by Kelvin Gomez on 4/10/2017.
 */
public class CheckingAccount extends Account {
 /**
     * Properties. -KG
     */
    private final double withdrawFee = 3.0d;
    private final double overdraftFee = 35.0d;
    private double initialBalance;
    private String customerId;
    private String accountDescription;
    /**
     * Constructor
     * @param initialBalance
     * @param customerId
     * @param accountDescription 
     */
    public CheckingAccount(double initialBalance, String customerId, String accountDescription) {

    }
    /*****************************
     *BEGIN: Getter & Setters. -KG
     */
    /**
     * Getter
     * @return 
     */
    public double getInitialBalance() {
        return initialBalance;
    }
    /**
     * Setter
     * @param initialBalance 
     */
    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
    /**
     * Getter
     * @return 
     */
    public String getCustomerId() {
        return customerId;
    }
    /**
     * Setter
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    /**
     * Getter
     * @return 
     */
    public String getAccountDescription() {
        return accountDescription;
    }
    /**
     * Setter
     * @param accountDescription 
     */
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
    /*****************************
     *END: Getter & Setters. -KG
     */
    
    /**
     * Adds a transaction "FEE" based on this accounts monthly and other fees.
     * @param amount
     */
    void applyFee( double amount ){
        initialBalance = initialBalance - amount;
        if(initialBalance < 0.0d){
            initialBalance = initialBalance - overdraftFee;
        }
    }
    /**
     * Add money into account
     * @param amount 
     */
    @Override
    public void deposit(double amount){
        initialBalance = initialBalance + amount;
    }
    /**
     * remove money from account
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        initialBalance = initialBalance - amount;
        applyFee(withdrawFee);
    }
    /**
     * toString Override
     * @return 
     */
    @Override
    public String toString() {
        return "Checkings{" + "Initial Balance = $" + initialBalance +
                ", Customer Id=" + customerId + ", Account Description=" +
                accountDescription + '}';
    }
}
