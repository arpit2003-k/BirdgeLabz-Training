/*Write a program to check if two texts are anagrams and display the result
Hint => 
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result. 
*/

import java.util.Scanner;

public class AnagramString {

    // Method to check anagram
    public static boolean isAnagram(String s1, String s2) {

        // remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        //   check length
        if (s1.length() != s2.length()) {
            return false;
        }

        // create frequency array
        int freq1[] = new int[256];
        int freq2[] = new int[256];

        //  count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
        }

        //  count characters of second string
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i)]++;
        }

        //  compare both frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result == true) {
            System.out.println("Both texts are anagrams.");
        } else {
            System.out.println("Both texts are NOT anagrams.");
        }
    }
}
