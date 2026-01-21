package com.filereader;
import java.io.*;

public class ReadFile {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/inputstreamreader/sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}