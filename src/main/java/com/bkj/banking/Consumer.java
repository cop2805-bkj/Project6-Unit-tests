package com.bkj.banking;

import java.util.Set;

/**
 * Created by bclaus on 4/6/17.
 */
public interface Consumer {

    /**
     * Returns a read-only Set of the customer's active accounts (if any)
     * @return
     */
    Set<Accountable> getCustomerAccounts();

    /**
     * Returns an Accountable with the given account ID, or null if no such account
     * @param accountId
     * @return
     */
    Accountable getAccount(String accountId);

    /**
     * the total fees paid by this customer for year-to-date
     * @return
     */
    double YtdFees();

    /**
     * Returns the total interest paid to this customer for year-to-date
     * @return
     */
    double YtdInterest();


    /*
    Getters, setters, toString, and other methods as needed
    You need to test any non-trivial methods your group decides are a good idea.
    */
}
