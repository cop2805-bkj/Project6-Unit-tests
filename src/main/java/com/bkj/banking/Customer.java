/*
 *     Customer.java is a part of BankingApp
 *     Copyright (c) 2017
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.bkj.banking;

import java.util.Map;
import java.util.Set;

public class Customer implements Consumer {
    /*
        I am not testing getters and setters for the most part because
        the data format was not given ahead of time and because in most cases
        I can't check if first or last name are valid in any useful context
     */
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
    public String addAccount(Accountable account) throws Exception {
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
