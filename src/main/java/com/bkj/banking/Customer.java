package com.bkj.banking;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Created by bclaus on 4/6/17.
 */
public class Customer implements Consumer {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerAccount(Map<String, Accountable> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    private String firstName, lastName;
    private Map<String, Accountable> customerAccounts;

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

    @Override
    public String addAccount(String uniqueId) throws Exception {
        return null;
    }

    @Override
    public boolean removeAccount(String uniqueId) throws Exception {
        return false;
    }

    @Override
    public int getAccountCount() {
        return 0;
    }

}
