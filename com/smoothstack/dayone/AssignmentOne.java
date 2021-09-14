package com.smoothstack.dayone;

public class AssignmentOne {

    public static void main(String[] args) {
        System.out.println("1)");
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println(".........");
        System.out.println("2)");
        System.out.println(".........");
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("3)");
        for (int i = 1; i < 8; i += 2) {
            int spacing = (11 - i) / 2;
            for (int j = 0; j < 11; j++) {
                if (j < spacing || j >= spacing + i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("...........");
        System.out.println("4)");
        System.out.println("............");
        for (int i = 7; i > 0; i -= 2) {
            int spacing = (11 - i) / 2;
            for (int j = 11; j > 0; j--) {
                if (j <= spacing || j > spacing + i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
