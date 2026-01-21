package com.linearsearch;

import java.util.Scanner;

public class SentenceSearch {

    // Returns first sentence containing the word
    public static int search(String[] sentences, String word) {
        for (int i=0;i<sentences.length ;i++) {
            if (sentences[i].equals(word))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        // Read sentences
        System.out.println("Enter sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        // Read search word
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        // Perform linear search
        int result = search(sentences, word);

        // Display result
        System.out.println("word it present in the " + (result+1)+" index of the arrray of sentences and the word of the Result is "+sentences[result]);

        sc.close();
    }
}