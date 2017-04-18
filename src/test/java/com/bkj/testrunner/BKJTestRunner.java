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
        final Result result = JUnitCore.runClasses(testClasses);
        assert (result != null);


        final int ranTestsCount = result.getRunCount();

        final int failTestsCount = result.getFailureCount();
        final List<Failure> failingTests = result.getFailures();

        assert (ranTestsCount >= failTestsCount); // Can't be too careful I guess
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
