package com.csvdatahandling.intermediatelevel.sortcsv;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class SortBySalary {

    public static void main(String[] args) throws IOException {
        List<String[]> employees = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/intermediatelevel/sortcsv/employees_sort.csv"));
        br.readLine(); // header

        String line;
        while ((line = br.readLine()) != null) {
            employees.add(line.split(","));
        }

        employees.sort((a, b) ->
                Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

        employees.stream().limit(5).forEach(e ->
                System.out.println(Arrays.toString(e)));

        br.close();
    }
}