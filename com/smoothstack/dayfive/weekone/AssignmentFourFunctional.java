package com.smoothstack.dayfive.weekone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentFourFunctional {
    public static List<String> noX(List<String> list) {
        return list.stream().map(str -> str.replaceAll("[xX]", "")).collect(Collectors.toList());
    }

//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("sdfj3", "fjX9cx", "9sjx dsfj", "0sjXlxi", "jkdslo", "ljxxoisjx", "");
//        noX(list).forEach(System.out::println);
//    }
}
