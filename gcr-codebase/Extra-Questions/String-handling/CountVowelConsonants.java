/* string Handling extra Questions

1. Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/

import java.util.*;

public class CountVowelConsonants{
	
	//Method to count the vowel and consonants..
	public static void countVowConson(String str){

	    int vowCount=0;
	    int consCount=0;

	    str=str.toLowerCase();

	         for(int i=0;i<str.length();i++){

	             if(str.charAt(i)>=97&&str.charAt(i)<=122){
	                 if(str.charAt(i)=='a'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='i'){
	                     vowCount++;
	                 }else{
	                     consCount++;
                     }
	             }
	             
	         }
	    System.out.println("Vowels: " + vowCount);
        System.out.println("Consonants: " + consCount);    
	}

	public static void main(String args[]){

	    //creating the Scanner object 
	    Scanner kb=new Scanner(System.in);

	         //Taking Input of the string to check the No of vowel and consonants
	         System.out.println("Enter the String to count vowel and consonants: ");
	         String str=kb.nextLine();

	    countVowConson(str);
	}
}