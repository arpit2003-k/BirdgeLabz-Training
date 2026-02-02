package com.javastreams.bufferedstreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadLargeFileLineByLine {

	    public static void main(String[] args) {

	        // Path to large file (500MB+ supported)
	        String filePath = "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-collections-practice/gcr-codebase/JavaCollectionPractice/src/com/javastreams/bufferedstreams/largefile.txt";

	        // try-with-resources ensures the reader is closed automatically
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

	            String line;

	            // Read file line by line
	            while ((line = reader.readLine()) != null) {

	                // Case-insensitive check for "error"
	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);
	                }
	            }

	            System.out.println("Finished scanning file.");

	        } catch (IOException e) {
	            System.out.println("Error while reading the file.");
	            e.printStackTrace();
	        }
	    }
	}
