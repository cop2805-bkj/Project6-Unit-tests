/*
 *     SavingsAccount.java is a part of BankingApp
 *     Copyright (c) 2017
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
     * Properties. -KG
     */
    private final double withdrawFee = 3.0d;
    private final double overdraftFee = 35.0d;
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
    public SavingsAccount(double initialBalance, String customerId, String accountDescription) {

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
        this.monthlyInterestRate = monthlyInterestRate / 100;
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
    public void transfer(Account fromAccount, Account toAccount, double amount){
        //TO do: waiting on transfer class implementation. -KG
    }
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
     * toString Override. -KG
     * @return monthlyInterestRate, initialBalance, customerID, and
     * accountDescription
     */
    @Override
    public String toString() {
        return "Savings{" + "Monthly InterestRate =" + monthlyInterestRate + 
                ", Initial Balance=" + initialBalance + ", Customer Id=" + 
                customerId + ", Account Description=" + accountDescription + '}';
    }    
}
