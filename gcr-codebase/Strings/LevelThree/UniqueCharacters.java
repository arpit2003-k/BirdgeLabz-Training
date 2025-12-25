/*Find unique characters in a string using the charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.Scanner;

public class UniqueCharacters {

    // a) Get length without using length()
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // b) Find unique characters
    public static char[] findUnique(String s) {

        int len = getLength(s);
        char[] unique = new char[len];
        int uIndex = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uIndex++] = ch;
            }
        }

        char[] result = new char[uIndex];
        for (int i = 0; i < uIndex; i++)
            result[i] = unique[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] uniques = findUnique(text);

        System.out.println("\nUnique Characters:");
        for (char c : uniques)
            System.out.print(c + " ");
    }
}
