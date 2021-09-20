package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentTwoFunctional;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssignmentTwoFunctionalTest {

    @Test
    public void rightDigitTest() {
        List<Integer> list = Arrays.asList(32, 543, 121, 54, 6, 23, 39, 2394, 1923, 239);
        assertThat(AssignmentTwoFunctional.rightDigit(list), is(Arrays.asList(2, 3, 1, 4, 6, 3, 9, 4, 3, 9)));
    }
}
