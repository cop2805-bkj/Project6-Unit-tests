package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 */
public class CheckingAccount extends Account {

    /**
     * Create a new checking account
     * @param initialBalance
     * @param customerId
     * @param accountDescription
     */
    CheckingAccount (double initialBalance, String customerId, String accountDescription){

    }

    /**
     * Adds a transaction "FEE" based on this account's monthly and other fees.
     * @param amount
     */
    void applyFee( double amount ){

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
    Getters, setters, (for example, to get and set the overdraft fee), toString, and other methods as needed (for example, inherited abstract methods)
    You need to test any non-trivial methods your group decides are a good idea.
    */
}
