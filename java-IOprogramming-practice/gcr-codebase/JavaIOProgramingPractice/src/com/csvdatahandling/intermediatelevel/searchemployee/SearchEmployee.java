package com.csvdatahandling.intermediatelevel.searchemployee;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class SearchEmployee {

    public static void main(String[] args) throws IOException {
        String searchName = "Ravi";
        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/intermediatelevel/searchemployee/employees_search.csv"));
        br.readLine(); // header

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
                break;
            }
        }
        br.close();
    }
}