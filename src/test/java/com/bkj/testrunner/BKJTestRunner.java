/*
 *     BKJTestRunner.java is a part of BankingApp
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

package com.bkj.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class BKJTestRunner {

    static final Class[] testClasses = {
            com.bkj.banking.BankTestUnit.class,
            com.bkj.banking.CheckingsAccountTestUnit.class,
            com.bkj.banking.SavingsAccountTestUnit.class,
            com.bkj.banking.CustomerTestUnit.class
    };

    public static void main(String[] args) {
        // Fun little trick with varargs methods
        // to preserve backward compatibility varargs (T...) is implemented as (T[])
        // so you can pass a array of objects to a varargs class
        System.out.printf("Running %d Test Units...%n", testClasses.length);


        /*
            Went assert happy throughout the JUnit Test runner
            my reasoning is since we can't (I mean we could...)
            write unit tests for our testing framework
            I should use asserts to ensure correct operation
            of this code.
         */

        // Make sure testClasses has at least 1 class to test
        assert (testClasses.length >= 1);
        final Result result = JUnitCore.runClasses(testClasses);
        assert (result != null);


        final int ranTestsCount = result.getRunCount();

        final int failTestsCount = result.getFailureCount();
        final List<Failure> failingTests = result.getFailures();

        // I doubt this could happen but check to make
        // sure we ran more tests than we failed
        assert (ranTestsCount >= failTestsCount);
        final int passedCount = (ranTestsCount - failTestsCount);

        final int ignoredTestCount = result.getIgnoreCount();

        final long runTime = result.getRunTime();

        final String testStatus = result.wasSuccessful() ? "PASS!" : "FAIL!";

        System.out.printf("Testing complete: %s%n%n", testStatus);
        if(!result.wasSuccessful()) {
            for (Failure fail : failingTests) {
                System.out.printf("\t>>> %s <<<%n", fail.getTestHeader());
                System.out.printf("\tFAILURE REASON: %s%n", fail.getException().getMessage());
                System.out.printf("\tSTACK TRACE:%n%n\t\t%s%n", fail.getTrace());
            }
        }
        System.out.printf("\t\t>>> TESTING STATS <<< %n");
        System.out.printf(
                "TESTS RAN:%d%n" +
                "TESTS PASSED:%d%n" +
                "TESTS FAILED:%d%n" +
                "TESTS IGNORED:%d%n" +
                "TOTAL TEST RUNTIME:%d ms%n",
                ranTestsCount, passedCount, failTestsCount, ignoredTestCount, runTime);


    }
}
