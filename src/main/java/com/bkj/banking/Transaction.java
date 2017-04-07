package com.bkj.banking;

/**
 * Created by bclaus on 4/6/17.
 */

/**
 * Class Transaction objects represent any deposit or withdrawal on any account.
 * (Note transfers are implemented as a pair of transactions.)
 */
public class Transaction implements Comparable<Transaction> {

    /**
     * Create a new transaction
     * @param type
     * @param amount
     * @param description
     */
    Transaction(TransactionType type, double amount, String description) {

    }

    /*
    Getters, setters, (for example, to get and possibly set the id, transaction timestamp, type, amount, and description), toString, and other methods as needed
    You need to test any non-trivial methods your group decides are a good idea.
    */

    enum TransactionType {

    }

    @Override
    public int compareTo(Transaction transaction) {
        return 0;
    }
}
