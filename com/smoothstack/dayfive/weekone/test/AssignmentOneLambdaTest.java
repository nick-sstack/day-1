package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentOneLambda;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssignmentOneLambdaTest {

    @Test
    public void isOddTest() {
        assertTrue(AssignmentOneLambda.isOdd().check(13));
        assertFalse(AssignmentOneLambda.isOdd().check(22));
    }

    @Test
    public void isPrimeTest() {
        assertTrue(AssignmentOneLambda.isPrime().check(13));
        assertFalse(AssignmentOneLambda.isPrime().check(22));
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(AssignmentOneLambda.isPalindrome().check(121));
        assertFalse(AssignmentOneLambda.isPalindrome().check(221));
    }
}
