package com.csvdatahandling.advancedlevel.deleteduplicate;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class DetectDuplicates {

    public static void main(String[] args) throws IOException {
        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/csvdatahandling/advancedlevel/deleteduplicate/duplicates.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];

            if (!ids.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }
        br.close();
    }
}
