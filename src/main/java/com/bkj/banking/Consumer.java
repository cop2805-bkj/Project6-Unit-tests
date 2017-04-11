package com.bkj.banking;

import java.util.Set;
import java.util.UUID;

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

    // On success returns the full string name
    String addAccount(Accountable account) throws Exception;

    // remove by UUID
    boolean removeAccount(String uniqueId) throws Exception;

    default int getAccountCount() {
        if (getCustomerAccounts() != null) {
            return this.getCustomerAccounts().size();
        } else {
            return 0;
        }
    }
}
