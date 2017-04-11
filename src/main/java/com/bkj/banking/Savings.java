package com.bkj.banking;
/**
 *
 * @author Kelvin Gomez (KG)
 */
public class Savings extends SavingsAccount {
    /**
     * Properties. -KG
     */
    private double monthlyInterestRate;
    private double initialBalance;
    private double currentBalance;
    private String customerId;
    private String accountDescription;    
    /**
     * Constructor. -KG
     * @param initialBalance
     * @param customerId
     * @param accountDescription 
     */
    
    /**
     * @param initialBalance
     * @param customerId
     * @param accountDescription
     */
    public Savings(double initialBalance, String customerId, String accountDescription) {
        super(initialBalance, customerId, accountDescription);
    }
    //******** BEGIN: Getter and setters. -KG    
    /**
     * Getter. -KG
     * @return monthlyInterestRate
     */
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    /**
     * Setter. -KG
     * @param monthlyInterestRate
     */
    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }
    /**
     * Getter. -KG
     * @return initialBalance
     */
    public double getInitialBalance() {
        return initialBalance;
    }
    /**
     * Setter. -KG
     * @param initialBalance 
     */
    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
    /**
     * Getter. -KG
     * @return currentBalance
     */
    public double getCurrentBalance() {
        return currentBalance;
    }
    /**
     * Setter. -KG
     * @param currentBalance 
     */
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    /**
     * Getter. -KG
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }
    /**
     * Setter. -KG
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    /**
     * Getter. -KG
     * @return 
     */
    public String getAccountDescription() {
        return accountDescription;
    }
    /**
     * Setter. -KG
     * @param accountDescription 
     */
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
    //******** END: Getter and setters. -KG 
    
    /**
     * Adds a transaction "INTEREST PAYMENT" based on this accounts monthly
     * interest rate. Used Simple Interest Formula. -KG
     */
    void addInterest(int years){
        currentBalance = currentBalance * (1 + (years * monthlyInterestRate));
    }
    /**
     * Add money into account. -KG
     * @param amount 
     */
    @Override
    public void deposit(double amount){
        currentBalance = currentBalance + amount;
    }
    /**
     * Remove money from account. -KG
     *
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        currentBalance = currentBalance - amount;
    }
    /**
     * Transfer funds between two accounts of a single customer. -KG
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount){
        //TO do: waiting on transfer class implementation. -KG
    }
    /**
     * toString Override. -KG
     * @return monthlyInterestRate, initialBalance, customerID, and
     * accountDescription
     */
    @Override
    public String toString() {
        return "Savings{" + "monthlyInterestRate=" + monthlyInterestRate + 
                ", initialBalance=" + initialBalance + ", customerId=" + 
                customerId + ", accountDescription=" + accountDescription + '}';
    }    
}
