/*4. Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string.*/


import java.util.*;
public class RemoveDuplicates{

		public static void main(String args[])
		{
		   //creating a scanner object 
		   Scanner sc=new Scanner(System.in);
		   //taking a string input fro user 
		   System.out.println("enter the string");
		   String s=sc.next();
		   System.out.println(removeDuplicatescharacters(s));
		}


		public static String removeDuplicatescharacters(String input) {
		  String s=" ";
		  boolean visited[]=new boolean[256];//asci value 
		  for (int i=0;i<input.length();i++)
		  {
			  char c=input.charAt(i);
			  
			  if(!visited[c])
			  {
				  visited[c]=true;
				  s+=c;
			  }
		  } 
		  return s;   
	}
}