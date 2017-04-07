package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
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
     * Adds a transaction "INTEREST PAYMENT" based on this account's monthly interest rate.
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

    /*
    Getters, setters, (for example, to get and set the monthly interest rate), toString, and other methods as needed (for example, inherited abstract methods)
    You need to test any non-trivial methods your group decides are a good idea.
    */

}
