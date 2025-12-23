/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
            System.out.println("Reason: Attempted to access an invalid array index.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Taking array size input
        System.out.println("Enter number of names:");
        int n = kb.nextInt();

        String[] names = new String[n];

        // Taking names input
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = kb.next();
        }

        generateException(names);

        
        handleException(names);

        kb.close();
    }
}
