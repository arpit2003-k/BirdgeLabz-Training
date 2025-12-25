/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/

import java.util.Scanner;

public class CharFrequencyUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        int len = text.length();
        char[] uniques = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (uniques[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniques[index++] = ch;
            }
        }

        // Create exact-sized array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = uniques[i];
        }

        return result;
    }

    // Method to compute frequency only for unique chars
    public static String[][] charFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniques = uniqueCharacters(text);

        String[][] result = new String[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = charFrequency(text);

        System.out.println("\nCharacter   Frequency");
        System.out.println("---------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println("   " + result[i][0] + " \t\t   " + result[i][1]);
        }
    }
}
