package com.json.validateemail;




import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ValidateEmailSchema {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(new File("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/validateemail/student.json"));
            System.out.println(" Email JSON structure is valid");
        } catch (Exception e) {
            System.out.println("Invalid email JSON");
        }
    }
}
