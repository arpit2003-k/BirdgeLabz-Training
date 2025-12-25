/*Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/

import java.util.Scanner;

public class CharFrequencyASCII {

    // Method to find frequency of characters and return 2D String array
    public static String[][] charFrequency(String text) {

        int[] freq = new int[256];  // ASCII frequency table

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count how many unique characters actually appeared
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as stored
            }
        }

        // Reset frequency values back to positive & create 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        int[] freq2 = new int[256]; // Recount cleanly
        for (int i = 0; i < text.length(); i++) {
            freq2[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq2[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq2[ch]);
                freq2[ch] = 0; // mark as processed
                index++;
            }
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
