package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrence 
{

	    public static void main(String[] args) throws Exception {

	        BufferedReader br = new BufferedReader(new FileReader("/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/inputstreamreader/sample.txt"));
	        String line;
	        int count = 0;
	        String word = "java";

	        while ((line = br.readLine()) != null) {
	            String[] words = line.split("\\s+");
	            for (String w : words) {
	                if (w.equalsIgnoreCase(word))
	                    count++;
	            }
	        }
	        br.close();
	        System.out.println("Occurrences: " + count);
	    }
	

}