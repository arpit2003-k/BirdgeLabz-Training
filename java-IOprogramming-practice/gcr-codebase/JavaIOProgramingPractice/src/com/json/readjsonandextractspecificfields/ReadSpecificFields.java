package com.json.readjsonandextractspecificfields;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/readjsonandextractspecificfields/users.json"));

        for (JsonNode node : root) {
            System.out.println(node.get("name").asText() +
                    " - " + node.get("email").asText());
        }
    }
}
