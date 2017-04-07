package com.bkj.banking;

import java.util.List;

/**
 * Interface Bankable is responsible for managing customers and accounts.
 */
public interface Bankable {

    /**
     * Creates a new bank account
     */
    void addAccount();

    /**
     * Deletes a given account.  (In the real world, just marks it as defunct or something.)
     * @param accountId
     */
    void removeAccount(String accountId);

    /**
     * Generates a report of all current accounts, in account ID order
     */
    void getAccounts ();

    /**
     * Find an account given an account ID
     * @param accountId
     * @return
     */
    Accountable getAccount (String accountId );

    /**
     * Add a new customer to the bank
     */
    void addCustomer ();

    /**
     * Deletes a customer from the bank.  (In reality, just marks the customer as non-current.)
      * @param customerId
     */
    void removeCustomer (String customerId);

    /**
     * Generates a report of all current customers, in customer ID order
     */
    void getCustomers ();

    /**
     * Get a Consumer object, given a customer's ID
      * @param customerId
     * @return
     */
    Consumer getCustomer (String customerId);

    /**
     * Get a List of Consumer objects, given a customer's last and first names.
     * (In this version, assume customer names are unique.)
     *
     * @param lastName
     * @param firstName
     * @return
     */
    List<Consumer> getCustomer (String lastName, String firstName);

    /**
     * Return a List of a given customer's accounts (if any)
     * @param customerId
     * @return
     */
    List<Accountable> getCustomersAccounts (String customerId);

    //Getters, setters, toString, and other methods as needed
    //You need to test any non-trivial methods your group decides are a good idea.
}
