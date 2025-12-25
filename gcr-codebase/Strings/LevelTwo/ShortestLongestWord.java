/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/

import java.util.*;

public class ShortestLongestWord {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                text.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {

        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = length;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] wordLength) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int minLength = Integer.parseInt(wordLength[0][1]);
        int maxLength = Integer.parseInt(wordLength[0][1]);

        for (int i = 1; i < wordLength.length; i++) {
            int len = Integer.parseInt(wordLength[i][1]);

            if (len < minLength) {
                minLength = len;
                shortestIndex = i;
            }

            if (len > maxLength) {
                maxLength = len;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Taking complete text input
        System.out.println("Enter the text:");
        String text = kb.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array of word and length
        String[][] wordLength = createWordLengthArray(words);

        // Find shortest and longest words
        int[] resultIndex = findShortestAndLongest(wordLength);

        // Display all words with lengths
        System.out.println(" Word    Length");
        System.out.println("----------------------");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(
                wordLength[i][0] + "   " + Integer.parseInt(wordLength[i][1])
            );
        }

        // Display shortest and longest word
        System.out.println("\nShortest Word: " +
                wordLength[resultIndex[0]][0] +
                " (Length: " +
                wordLength[resultIndex[0]][1] + ")");

        System.out.println("Longest Word: " +
                wordLength[resultIndex[1]][0] +
                " (Length: " +
                wordLength[resultIndex[1]][1] + ")");

        kb.close();
    }
}
