/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in toCharArray() method, compare the 2 arrays, and finally display the result
*/


import java.util.*;

public class CharactersStringConverstion {

    // User-defined method to return characters
    public static char[] character(String str) {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Method to compare two character arrays
    public static boolean compareCharArray(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = kb.next();

        // User-defined method
        char[] userArray = character(str);

        // Built-in method
        char[] builtInArray = str.toCharArray();

        // Display characters
        System.out.println("Characters using user-defined method:");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using built-in toCharArray():");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        // Compare results
        if (compareCharArray(userArray, builtInArray)) {
            System.out.println("\nResult VERIFIED: Both arrays are equal.");
        } else {
            System.out.println("\nResult NOT VERIFIED: Arrays are not equal.");
        }

        kb.close();
    }
}
