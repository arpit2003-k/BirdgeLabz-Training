/*2. Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.*/

import java.util.*;

public class ReverseString{

    public static String toReverse(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        return str1;
        
    }

    public static void main(String args[]){

        //Creating the object of the Scanner 
        Scanner kb=new Scanner(System.in);

        //Taking the Input...
        System.out.println("Enter the string : ");
        String str=kb.nextLine();

        // Reciveing the method..
         str=toReverse(str);

         System.out.println("The reversed String is :" + str);
    }
	

}