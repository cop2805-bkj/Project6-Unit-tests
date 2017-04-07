package com.bkj.banking;

import java.util.Set;

/**
 * Created by bclaus on 4/6/17.
 */
public class Customer implements Consumer {

    /**
     * Creates a new Customer object from a name.  Note for this project, we assume names are unique.
     *
     * @param lastName
     * @param firstName
     */
    Customer(String lastName, String firstName) {

    }

    /**
     * Returns a read-only Set of the customer's active accounts (if any)
     *
     * @return
     */
    @Override
    public Set<Accountable> getCustomerAccounts() {
        return null;
    }

    /**
     * Returns an Accountable with the given account ID, or null if no such account
     *
     * @param accountId
     * @return
     */
    @Override
    public Accountable getAccount(String accountId) {
        return null;
    }

    /**
     * the total fees paid by this customer for year-to-date
     *
     * @return
     */
    @Override
    public double YtdFees() {
        return 0;
    }

    /**
     * Returns the total interest paid to this customer for year-to-date
     *
     * @return
     */
    @Override
    public double YtdInterest() {
        return 0;
    }
}
