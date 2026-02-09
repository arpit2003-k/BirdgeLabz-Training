package com.csvdatahandling.basiclevel.readcsv;

import java.io.*;
public class ReadStudentCSV {

    public static void main(String[] args) {
        String filePath = "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/basiclevel/readcsv/student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Age: " + data[2] +
                        ", Marks: " + data[3]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}