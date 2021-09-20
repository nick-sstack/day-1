package com.smoothstack.dayfive.basics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssignmentOneTest {

    AssignmentOne ao;

    @Before
    public void setUp() {
        List<String> strings = Arrays.asList("Zane", "Mike", "Amy", "Eric", "Steve", "Frank", "Jim", "Evan", "Brittany");
        List<Integer> numbers = new ArrayList<>();
        int i = 1;
        while (i < 11) {
            numbers.add(i++);
        }
        ao = new AssignmentOne(strings, numbers);
    }

    @Test
    public void sortByLengthShortestTest() {
        List<String> correct = Arrays.asList("Amy", "Jim", "Zane", "Mike", "Eric", "Evan", "Steve", "Frank", "Brittany");
        assertThat(ao.sortByLengthShortest(), is(correct));
    }

    @Test
    public void sortByLengthLongestTest() {
        List<String> correct = Arrays.asList("Brittany", "Steve", "Frank", "Zane", "Mike", "Eric", "Evan", "Amy", "Jim");
        assertThat(ao.sortByLengthLongest(), is(correct));
    }

    @Test
    public void sortByFirstLetterTest() {
        List<String> correct = Arrays.asList("Amy", "Brittany", "Eric", "Evan", "Frank", "Jim", "Mike", "Steve", "Zane");
        assertThat(ao.sortByFirstLetter(), is(correct));
    }

    @Test
    public void sortByETest() {
        List<String> correct = Arrays.asList("Evan", "Eric", "Zane", "Mike", "Amy", "Steve", "Frank", "Jim", "Brittany");
        assertThat(ao.sortByE(), is(correct));
    }

    @Test
    public void sortByEWithHelperTest() {
        List<String> correct = Arrays.asList("Evan", "Eric", "Zane", "Mike", "Amy", "Steve", "Frank", "Jim", "Brittany");
        assertThat(ao.sortByEWithHelper(), is(correct));
    }

    @Test
    public void intListTest() {
        String ans = "o1,e2,o3,e4,o5,e6,o7,e8,o9,e10";
        assertThat(ao.intList(), is(ans));
    }

    @Test
    public void stringListTest() {
        List<String> correct = Arrays.asList("Amy");
        assertThat(ao.stringList(), is(correct));
    }
}
