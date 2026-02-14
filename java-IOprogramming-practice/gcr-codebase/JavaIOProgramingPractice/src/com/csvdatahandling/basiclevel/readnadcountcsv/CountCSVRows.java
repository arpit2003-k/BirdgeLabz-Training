package com.csvdatahandling.basiclevel.readnadcountcsv;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class CountCSVRows {

    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/basiclevel/readnadcountcsv/student.csv"))) {
            br.readLine(); // skip header

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total records: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}