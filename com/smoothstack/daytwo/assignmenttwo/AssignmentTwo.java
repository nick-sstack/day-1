package com.smoothstack.daytwo.assignmenttwo;

import java.util.Random;

public class AssignmentTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[random.nextInt(1000) + 1][random.nextInt(1000) + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    index1 = i;
                    index2 = j;
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Max value: %d at Index: (%d, %d)\n", max, index1, index2);
    }
}
