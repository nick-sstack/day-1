package com.smoothstack.daythree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentTwo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter a file to append to.");
            return;
        }
        File file = new File(args[0]);
        if (!file.isFile()) {
            System.out.println("Not a valid file.");
            return;
        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.write("Aenean est arcu, tempor vitae porttitor elementum, pellentesque quis libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices.\n");
            System.out.println("File successfully written.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
