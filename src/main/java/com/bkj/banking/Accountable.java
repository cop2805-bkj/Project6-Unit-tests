package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 */
public interface Accountable {

    /**
     * Transfer funds between two accounts of a single customer.
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
     static void transfer (Accountable fromAccount, Accountable toAccount, double amount ) {

     }

    /**
     * Add money into account
     * @param amount
     */
    void deposit (double amount);

    /**
     * remove money from account
     * @param amount
     */
    void withdraw (double amount);


    /*
    Getters, setters, toString, and other methods as needed
    You need to test any non-trivial methods your group decides are a good idea.
    */

    // Overriden to return the accountID as a string of the account
    @Override
    String toString();

}
