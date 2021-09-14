package com.smoothstack.dayone;

import java.util.Random;
import java.util.Scanner;

public class AssignmentTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        System.out.println("You win if you're within 10.\n");
        Random r = new Random();
        int random = r.nextInt(100) + 1;
        //System.out.println(random);
        int tries = 0;
        while (tries < 5) {
            int num = -1;
            while (num < 1 || num > 100) {
                System.out.printf("Pick a number (%d Attempts Left): ", 5 - tries);
                String temp = in.nextLine();
                if (!isNum(temp)) {
                    System.out.println("Must be an integer.");
                } else {
                    num = Integer.parseInt(temp);
                    if (num < 1 || num > 100) System.out.println("Must be between 1 and 100");
                }
            }
            if (Math.abs(num - random) <= 10) {
                System.out.printf("Correct! The number was %d.\n", random);
                break;
            } else {
                System.out.println("Try again.");
            }
            tries++;
        }
        in.close();
        if (tries >= 5) System.out.printf("Sorry, the number was %d.\n", random);
    }

    private static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
