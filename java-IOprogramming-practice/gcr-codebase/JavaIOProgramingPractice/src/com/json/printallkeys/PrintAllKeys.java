package com.json.printallkeys;

import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;

public class PrintAllKeys {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/printallkeys/users.json"));

        for (JsonNode obj : node) {
            Iterator<String> keys = obj.fieldNames();
            while (keys.hasNext()) {
                String k = keys.next();
                System.out.println(k + " : " + obj.get(k));
            }
        }
    }
}
