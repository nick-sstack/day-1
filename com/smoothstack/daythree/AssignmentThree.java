package com.smoothstack.daythree;

import java.io.*;

public class AssignmentThree {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("1st argument must be a file and 2nd must be a character.");
            return;
        }
        if (args[1].length() != 1) {
            System.out.println("2nd argument must be a character.");
            return;
        }
        BufferedReader br = null;
        FileReader fr = null;
        try {
            File file = new File(args[0]);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            char toFind = args[1].charAt(0);
            int numTimes = 0;
            int toRead;
            while ((toRead = br.read()) != -1) {
                if (toRead == toFind) numTimes++;
            }
            System.out.printf("The character '%c' appears %d time(s) in file %s\n", toFind, numTimes, file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("Not a valid file.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
