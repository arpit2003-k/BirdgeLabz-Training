/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/

import java.util.*;

public class CustomTrimComparison {

    // Method to find start & end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end is exclusive
    }

    // Method to create substring manually using charAt()
    public static String manualSubstring(String text, int start, int endExclusive) {

        String result = "";

        for (int i = start; i < endExclusive; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
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

        System.out.println("Enter a string with leading and trailing spaces:");
        String text = kb.nextLine();

        // Get trim indexes
        int[] indexes = findTrimIndexes(text);

        // Get custom trimmed string
        String customTrim = manualSubstring(text, indexes[0], indexes[1]);

        // Built-in trim()
        String builtinTrim = text.trim();

        // Compare
        boolean match = compareStrings(customTrim, builtinTrim);

        System.out.println("Custom Trim Result   : \"" + customTrim + "\"");
        System.out.println("Built-in Trim Result : \"" + builtinTrim + "\"");
        System.out.println("\nDo both match? " + match);

        kb.close();
    }
}
