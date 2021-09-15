package com.smoothstack.daythree;

import java.io.File;
import java.util.Objects;

public class AssignmentOne {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Specify a path to print files in the directory.");
            return;
        }
        for (String s : args) {
            File file = new File(s);
            if (file.exists()) {
                for (String f : Objects.requireNonNull(file.list())) {
                    System.out.println(f);
                }
            } else System.out.println("Not a valid directory.");
        }
    }
}
