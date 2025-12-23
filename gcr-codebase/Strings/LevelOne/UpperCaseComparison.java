/*Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
*/


import java.util.*;

public class UpperCaseComparison {

    public static String convertToUpper(String text) {

        String upperText = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upperText += (char) (ch - 32); 
            } else {
                upperText += ch;  // Keep as it is
            }
        }
        return upperText;
    }

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the complete text:");
        String text = kb.nextLine();

        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Uppercase using user-defined method:");
        System.out.println(userUpper);

     
        if (compareStrings(userUpper, builtInUpper)) {
            System.out.println("VERIFIED: Both uppercase strings are equal.");
        } else {
            System.out.println("NOT VERIFIED: Strings are different.");
        }

        kb.close();
    }
}
