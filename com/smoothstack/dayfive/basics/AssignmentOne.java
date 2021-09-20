package com.smoothstack.dayfive.basics;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AssignmentOne {

    private final List<String> strings;
    private final List<Integer> numbers;

    public AssignmentOne() {
        strings = Arrays.asList("Amanda", "Emily", "Steve", "Mike", "Amy", "Sam", "Chris", "Jessica", "Eric", "Are");
        numbers = new ArrayList<>();
        Random random = new Random();
        while (numbers.size() < 10) {
            numbers.add(random.nextInt(1000));
        }
    }

    public AssignmentOne(List<String> strings, List<Integer> numbers) {
        this.strings = strings;
        this.numbers = numbers;
    }

    public List<String> sortByLengthShortest() {
        strings.sort((String s1, String s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            return 0;
        });
        return strings;
    }

    public List<String> sortByLengthLongest() {
        strings.sort((String s1, String s2) -> {
            if (s1.length() < s2.length()) return 1;
            else if (s1.length() > s2.length()) return -1;
            return 0;
        });
        return strings;
    }

    public List<String> sortByFirstLetter() {
        strings.sort((String s1, String s2) -> {
            if (s1.toLowerCase().charAt(0) > s2.toLowerCase().charAt(0)) return 1;
            else if (s1.toLowerCase().charAt(0) < s2.toLowerCase().charAt(0)) return -1;
            return 0;
        });
        return strings;
    }

    public List<String> sortByE() {
        strings.sort((String s1, String s2) -> {
            if (s1.toLowerCase().charAt(0) == 'e') return -1;
            else if (s2.toLowerCase().charAt(0) == 'e') return 1;
            return 0;
        });
        return strings;
    }

    public List<String> sortByEWithHelper() {
        strings.sort(AssignmentOne::helperSort);
        return strings;
    }

    private static int helperSort(String s1, String s2) {
        if (s1.toLowerCase().charAt(0) == 'e') return -1;
        else if (s2.toLowerCase().charAt(0) == 'e') return 1;
        return 0;
    }

    public String intList() {
        StringBuilder sb = new StringBuilder();
        numbers.forEach((num) -> {
            if (num % 2 == 0) sb.append("e").append(num);
            else sb.append("o").append(num);
            sb.append(",");
        });
        return sb.substring(0, sb.length() - 1);
    }

    public List<String> stringList() {
        return strings.stream().filter((name) -> name.toLowerCase().charAt(0) == 'a' && name.length() == 3).toList();
    }

    public static void main(String[] args) {
        int month = 10;
        int day = 13;
        int year = 1985;

        LocalDate date = LocalDate.of(year, month, day);
        if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
            System.out.printf("%1$tB %1$td, %1$tY is Friday the 13th.%n", date);
        } else System.out.printf("%1$tB %1$td, %1$tY is on a %tA.%n", date);
    }
}
