package com.smoothstack.daytwo.assignmentone;

public class AssignmentOne {
    public static void main(String[] args) {
        double sum = 0;
        int invalid = 0;
        for (String s : args) {
            if (isDouble(s)) {
                sum += Double.parseDouble(s);
            } else invalid++;
        }
        System.out.printf("Total sum: %.5f (%d invalid arguments)\n", sum, invalid);
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
