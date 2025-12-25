/* 
Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
*/
import java.util.Scanner;

public class PalindromeCheckThreeLogics {

    //  Logic 1: Iterative 
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive 
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //  reverse using charAt 
    public static char[] reverseUsingCharAt(String text) {
        char[] rev = new char[text.length()];
        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = text.charAt(i);
        }
        return rev;
    }

    // Logic 3: Using char arrays 
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String text = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");

        System.out.println("Logic 1 (Iterative): " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Recursive): " +
                (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Char Arrays): " +
                (isPalindromeUsingArrays(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
