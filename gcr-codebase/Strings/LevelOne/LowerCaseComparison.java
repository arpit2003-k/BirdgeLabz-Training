/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result

*/

import java.util.*;

public class LowerCaseComparison {

    public static String convertToLower(String text) {

        String lowerText = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                lowerText += (char) (ch + 32); 
            } else {
                lowerText += ch;  // Keep as it is
            }
        }
        return lowerText;
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

        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Lowercase using user-defined method:");
        System.out.println(userLower);

     
        if (compareStrings(userLower, builtInLower)) {
            System.out.println("VERIFIED: Both lowercase strings are equal.");
        } else {
            System.out.println("NOT VERIFIED: Strings are different.");
        }

        kb.close();
    }
}
