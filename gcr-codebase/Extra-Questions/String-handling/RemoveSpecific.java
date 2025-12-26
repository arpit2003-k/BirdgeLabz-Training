/*10. Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"*/


import java.util.*;

public class RemoveSpecific {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
		System.out.println("Enter the character to remove:");
        char c = sc.next().charAt(0);
        
        removeASpecificCharacter(s, c);
        sc.close();
    }

    public static void removeASpecificCharacter(String s, char c) {

        String sn="";
		

        //Find maximum frequency
        

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=c) {
               sn+=s.charAt(i);
            }
        }

        //  Display result
       
        System.out.println(sn);
    }
}