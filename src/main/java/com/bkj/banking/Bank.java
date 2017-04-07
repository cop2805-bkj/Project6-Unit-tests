package com.bkj.banking;

import java.util.List;

/**
 * Created by bclaus on 4/6/17.
 */
public class Bank implements Bankable {

    /**
     * Creates a new Bank object with the given name
     * @param name
     */
    public Bank(String name) {

    }

    /**
     * Creates a new bank account
     */
    @Override
    public void addAccount() {

    }

    /**
     * Deletes a given account.  (In the real world, just marks it as defunct or something.)
     *
     * @param accountId
     */
    @Override
    public void removeAccount(String accountId) {

    }

    /**
     * Generates a report of all current accounts, in account ID order
     */
    @Override
    public void getAccounts() {

    }

    /**
     * Find an account given an account ID
     *
     * @param accountId
     * @return
     */
    @Override
    public Accountable getAccount(String accountId) {
        return null;
    }

    /**
     * Add a new customer to the bank
     */
    @Override
    public void addCustomer() {

    }

    /**
     * Deletes a customer from the bank.  (In reality, just marks the customer as non-current.)
     *
     * @param customerId
     */
    @Override
    public void removeCustomer(String customerId) {

    }

    /**
     * Generates a report of all current customers, in customer ID order
     */
    @Override
    public void getCustomers() {

    }

    /**
     * Get a Consumer object, given a customer's ID
     *
     * @param customerId
     * @return
     */
    @Override
    public Consumer getCustomer(String customerId) {
        return null;
    }

    /**
     * Get a List of Consumer objects, given a customer's last and first names.
     * (In this version, assume customer names are unique.)
     *
     * @param lastName
     * @param firstName
     * @return
     */
    @Override
    public List<Consumer> getCustomer(String lastName, String firstName) {
        return null;
    }

    /**
     * Return a List of a given customer's accounts (if any)
     *
     * @param customerId
     * @return
     */
    @Override
    public List<Accountable> getCustomersAccounts(String customerId) {
        return null;
    }
}
