package com.json.filterjson;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/filterjson/users.json"));

        for (JsonNode n : root) {
            if (n.get("age").asInt() > 25) {
                System.out.println(n);
            }
        }
    }
}
