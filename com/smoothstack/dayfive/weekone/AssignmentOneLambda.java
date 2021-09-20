package com.smoothstack.dayfive.weekone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignmentOneLambda {

    public interface Action {
        boolean check(int num);
    }

    public static Action isOdd() {
        return num -> num % 2 != 0;
    }

    public static Action isPrime() {
        return num -> {
            int i = 2;
            while (i < num / 2) {
                if (num % i++ == 0) return false;
            }
            return true;
        };
    }

    public static Action isPalindrome() {
        return (num) -> {
            int reversedNum = 0, remainder;

            int originalNum = num;

            while (num != 0) {
                remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
            }

            return originalNum == reversedNum;
        };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of numbers: ");
        String amount = in.nextLine();
        try {
            Integer.parseInt(amount);
        } catch (NumberFormatException e) {
            System.out.println("Must be an integer.");
            return;
        }
        int num = Integer.parseInt(amount);
        List<String> numbers = new ArrayList<>();
        System.out.println("Enter an action followed by the number separated by a space.");
        System.out.println("Actions are 1 for isOdd, 2 for isPrime, 3 for isPalindrome");
        int i = 0;
        while (i < num) {
            numbers.add(in.nextLine());
            i++;
        }
        try {
            for (String s : numbers) {
                String[] al = s.split(" ");
                int action = Integer.parseInt(al[0]);
                int number = Integer.parseInt(al[1]);
                switch (action) {
                    case 1:
                        if (isOdd().check(number)) {
                            System.out.println("ODD");
                        } else System.out.println("EVEN");
                        break;
                    case 2:
                        if (isPrime().check(number)) {
                            System.out.println("PRIME");
                        } else System.out.println("COMPOSITE");
                        break;
                    case 3:
                        if (isPalindrome().check(number)) {
                            System.out.println("PALINDROME");
                        } else System.out.println("NOT A PALINDROME");
                        break;
                    default:
                        System.out.println("Not a valid action.");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
