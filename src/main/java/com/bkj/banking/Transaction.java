/*
 *     Transaction.java is a part of BankingApp
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

    /**
     * Changed from the website documentation
     * I added some common transaction types because why
     * would we include a empty enum?
     */
    enum TransactionType {
        DEPOSIT,
        WITHDRAW,
        INTEREST,
        FEE,
    }

    @Override
    public int compareTo(Transaction transaction) {
        return 0;
    }
}
