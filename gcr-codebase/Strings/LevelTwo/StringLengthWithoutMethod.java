/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result*/

import java.util.*;

public class StringLengthWithoutMethod {

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

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the String:");
        String text = kb.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        kb.close();
    }
}
