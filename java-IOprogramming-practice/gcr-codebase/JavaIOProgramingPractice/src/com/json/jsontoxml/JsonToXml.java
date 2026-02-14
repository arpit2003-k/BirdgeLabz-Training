package com.json.jsontoxml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

public class JsonToXml {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        Object obj = jsonMapper.readValue(
                new File(
                    "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/jsontoxml/student.json"
                ),
                Object.class
        );

        xmlMapper.writeValue(
                new File(
                    "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/jsontoxml/student.xml"
                ),
                obj
        );

        System.out.println(" JSON converted to XML successfully!");
    }
}
