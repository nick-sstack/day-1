package com.smoothstack.dayfive.weekone.test;

import com.smoothstack.dayfive.weekone.AssignmentFourFunctional;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssignmentFourFunctionalTest {

    @Test
    public void noXTest() {
        List<String> list = Arrays.asList("sdfj3", "fjX9cx", "9sjx dsfj", "0sjXlxi", "jkdslo", "ljxxoisjx", "");
        assertThat(AssignmentFourFunctional.noX(list), is(Arrays.asList("sdfj3", "fj9c", "9sj dsfj", "0sjli", "jkdslo", "ljoisj", "")));
    }
}
