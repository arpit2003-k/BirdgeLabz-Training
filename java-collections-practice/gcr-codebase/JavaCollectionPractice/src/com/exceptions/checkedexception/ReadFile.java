package com.exceptions.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-collections-practice/gcr-codebase/JavaCollectionPractice/src/com/exceptions/checkedexception/data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}