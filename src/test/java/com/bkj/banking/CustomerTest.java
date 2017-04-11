package com.bkj.banking;


import java.beans.ExceptionListener;
import java.util.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// TODO: The project page does not define a format for accounts
public class CustomerTest {
    Consumer mockConsumer;

    final int ACCOUNT_SET_SIZE = 10;

    @Before
    public void setUp() throws Exception {
        mockConsumer = new Customer("Tests", "JUnit");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test_addAccount() throws Exception {
        // Since I only want to test addAccount() and not other methods in the class
        Stack<String> accountIDs = new Stack<>();
        for (int i = 0; i < ACCOUNT_SET_SIZE; i++) {
            accountIDs.push(mockConsumer.addAccount(UUID.randomUUID().toString()));
        }
        // We should have ${ACCOUNT_SET_SIZE} accounts after adding them
        // this is the only way I can think of without reflection to test
        // if adding accounts is working, without using other parts of this class
        Assert.assertTrue("Incorrect number of accounts after adding accounts!",
                mockConsumer.getAccountCount() == ACCOUNT_SET_SIZE);
    }

    // TODO: in a real test case Exception would be a custom runtime exception
    // such as DuplicateAccountException so it would have a more descriptive name
    @Test(expected = Account.DuplicateAccountException.class)
    public void test_AddAccountInvalid_Duplicate() throws Exception {
        UUID accountID = UUID.randomUUID();
        mockConsumer.addAccount(accountID.toString());

        // Since we are adding a duplicate this should throw an exception
        // we will fail this test if it doesn't
        mockConsumer.addAccount(accountID.toString());
    }

    @Test
    public void test_getCustomerAccounts_Valid() throws Exception {
        // add ${ACCOUNT_SET_SIZE} accounts to mock object and store names
        // in a stack for later checking.
        Map<String, Boolean> accountIDs = new HashMap<>();

        for (int i = 0; i < ACCOUNT_SET_SIZE; i++) {
            accountIDs.put(mockConsumer.addAccount(UUID.randomUUID().toString()),
                    Boolean.FALSE);
        }

        // Testing getCustomerAccounts()
        if(mockConsumer.getCustomerAccounts() != null) {
            for (Accountable a : mockConsumer.getCustomerAccounts()) {
                if (accountIDs.containsKey(a.toString())) {
                    accountIDs.replace(a.toString(), true);
                }
            }
        }
        Assert.assertFalse("Unable to find newly created account in getCustomerAccounts()!",
                accountIDs.containsValue(Boolean.FALSE));
    }

    @Test
    public void test_getCustomerAccounts_NoAccounts() throws Exception {
        // This is to test that even if the customer has no accounts
        // that getCustomerAccounts returns a empty set not a NullPointer
        Assert.assertNotNull("getCustomerAccounts() returned null on a new instance",
                            mockConsumer.getCustomerAccounts());

        Assert.assertEquals("getCustomerAccounts() returned a collection size without any objects",
                            0, mockConsumer.getAccountCount());
    }

    @Test (expected = UnsupportedOperationException.class)
    public void test_getCustomerAccounts_CheckReadOnly() throws Exception {

        // should throw a UnsupportedOperationException on an attempted add from getCustomerAccounts
        // the proper way to add is with the setter addAccount();
        try {
            mockConsumer.getCustomerAccounts().add(new CheckingAccount(
                    500.0d,
                    "Tests, JUnit",
                    "JUnit testing"));

            // this should always fail so...
            Assert.fail("Checking unmodifiable status on getCustomerAccounts returned a modifiable collection!");

        } catch (UnsupportedOperationException uoe) {
            throw uoe;
        } catch (NullPointerException e) {
            // gracefully handle the situation where Accounts is not initilized
            Assert.fail("Customer accounts collection is null");
        }
    }

    @Test
    public void test_getAccount_Valid() throws Exception {

    }

    @Test
    public void test_getAccount_NotFound() throws Exception {

    }
}