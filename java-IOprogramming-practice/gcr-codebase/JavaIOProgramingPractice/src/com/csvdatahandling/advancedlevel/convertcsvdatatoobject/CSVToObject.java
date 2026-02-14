package com.csvdatahandling.advancedlevel.convertcsvdatatoobject;


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class CSVToObject {

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/advancedlevel/convertcsvdatatoobject/students_object.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            students.add(new Student(
                    Integer.parseInt(d[0]),
                    d[1],
                    Integer.parseInt(d[2]),
                    Integer.parseInt(d[3])
            ));
        }

        students.forEach(System.out::println);
        br.close();
    }
}