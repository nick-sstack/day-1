package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentThreeFunctional;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssignmentThreeFunctionalTest {

    @Test
    public void doublingTest() {
        List<Integer> list = Arrays.asList(32, 543, 121, 54, 6, 23, 39, 2394, 1923, 239);
        assertThat(AssignmentThreeFunctional.doubling(list), is(Arrays.asList(64, 1086, 242, 108, 12, 46, 78, 4788, 3846, 478)));
    }
}
