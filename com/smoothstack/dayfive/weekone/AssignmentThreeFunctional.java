package com.smoothstack.dayfive.weekone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentThreeFunctional {
    public static List<Integer> doubling(List<Integer> list) {
        return list.stream().map(num -> num * 2).collect(Collectors.toList());
    }

//    public static void main(String[] args) {
    //        List<Integer> list = Arrays.asList(32, 543, 121, 54, 6, 23, 39, 2394, 1923, 239);
    //        doubling(list).forEach(System.out::println);
    //    }
}
