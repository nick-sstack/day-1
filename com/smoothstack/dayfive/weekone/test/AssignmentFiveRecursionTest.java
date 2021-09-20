package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentFiveRecursion;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssignmentFiveRecursionTest {

    @Test
    public void groupSumClumpTest() {
        int[] arr = new int[]{23, 42, 12, 65, 23, 12, 876, 234, 2, 2, 1123, 34, 39};
        assertTrue(AssignmentFiveRecursion.groupSumClump(0, arr, 4));
        assertFalse(AssignmentFiveRecursion.groupSumClump(0, arr, 6));
    }
}