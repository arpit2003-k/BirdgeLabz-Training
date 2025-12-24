/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

import java.util.*;

public class SplitTextComparison {

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

    public static String[] splitText(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;

        // Step 3: Extract words
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

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Taking complete text input
        System.out.println("Enter the text:");
        String text = kb.nextLine();

        // User-defined split
        String[] userWords = splitText(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Display words
        System.out.println("\nWords using user-defined method:");
        for (String w : userWords) {
            System.out.println(w);
        }

        System.out.println("\nWords using built-in split():");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        // Compare results
        if (compareStringArrays(userWords, builtInWords)) {
            System.out.println("VERIFIED: Both methods give the same output.");
        } else {
            System.out.println(" NOT VERIFIED: Outputs are different.");
        }

        kb.close();
    }
}
