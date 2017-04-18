/*
 *     Consumer.java is a part of BankingApp
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

import java.util.Set;
import java.util.UUID;

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
