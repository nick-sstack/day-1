package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentSixSingleton;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AssignmentSixSingletonTest {

    @Test
    public void getInstanceTest() {
        AssignmentSixSingleton singleton = AssignmentSixSingleton.getInstance();
        assertNotNull(singleton);
    }
}
