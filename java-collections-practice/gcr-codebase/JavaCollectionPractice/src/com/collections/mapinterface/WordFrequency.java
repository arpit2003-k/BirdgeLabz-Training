package com.collections.mapinterface;
import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: take input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Step 2: lowercase
        text = text.toLowerCase();

        // Step 3: remove punctuation
        text = text.replaceAll("[^a-zA-Z ]", "");

        // Step 4: split words
        String[] words = text.split("\\s+");

        // Step 5: HashMap for frequency
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 6: print result
        System.out.println(map);

        sc.close();
    }
}