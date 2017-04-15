package com.bkj.banking;

/**
 *  Class Account is responsible for managing the details of any type of account,
 *  including an accountId, customerId, description, account creation date,
 *  the current balance, and the account's transaction list.
 */

public abstract class Account implements Accountable {
    class DuplicateAccountException extends Exception {
        // TODO: place holder to make some code prettier
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    // implemented to make test code more usable
    String accountID;
}
