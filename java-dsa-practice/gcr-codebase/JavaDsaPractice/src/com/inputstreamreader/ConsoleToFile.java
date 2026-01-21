package com.inputstreamreader;

import java.io.*;

public class ConsoleToFile {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/inputstreamreader/output.txt");

        String input;
        System.out.println("Enter the text to add in the file-----");
        while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
            fw.write(input + "\n");
        }
        System.out.println("The file is been edited----");

        fw.close();
        br.close();
    }
}