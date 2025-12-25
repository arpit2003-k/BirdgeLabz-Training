/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class VowelConsonantTable {

    // Method to check whether a character is vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to build 2D array of characters and their type
    public static String[][] findCharacterType(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }

        return result;
    }

    // Method to display 2D array in table format
    public static void displayTable(String[][] data) {

        System.out.println("  Character   Type");
        System.out.println("----------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "  " + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = kb.nextLine();

        String[][] output = findCharacterType(text);

        displayTable(output);

        kb.close();
    }
}

