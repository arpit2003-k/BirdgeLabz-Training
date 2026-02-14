package com.csvdatahandling.basiclevel.writecsv;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class WriteEmployeeCSV {

    public static void main(String[] args) {
        String filePath = "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/basiclevel/writecsv/employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Write header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            
            
            
            // Write records
            bw.write("1,John,IT,60000");
            bw.newLine();
            bw.write("2,Alice,HR,50000");
            bw.newLine();
            bw.write("3,Bob,Finance,70000");
            bw.newLine();
            bw.write("4,Eva,IT,80000");
            bw.newLine();
            bw.write("5,Tom,Sales,45000");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}