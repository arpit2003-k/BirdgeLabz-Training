package com.inputstreamreader;
import java.io.*;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/inputstreamreader/sample.txt"), "UTF-8"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}