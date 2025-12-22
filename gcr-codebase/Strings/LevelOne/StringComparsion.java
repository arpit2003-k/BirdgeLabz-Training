

/*
----Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

Hint => 

Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/

import java.util.*;

    public class StringComparsion{

        // Method to check the string content..
        public static boolean equalString(String str1,String str2){

            int length=str1.length();
            
            if(str1.length()!=str2.length()){
              return false;
            }

            for(int i=0;i<length;i++){
                if(str1.charAt(i)==str2.charAt(i)){
                  if(i==str1.length()-1){
                  return true;
                  }
                }
            }
          return false;  

        }

        public static void main(String[]args){

            // creating scanner object..
            Scanner kb=new Scanner(System.in);


            // taking the input of string type
            System.out.println("Enter the String 1st:");
            String str1=kb.next();
            System.out.println("Enter the String 2nd:");
            String str2=kb.next();

            //checking the string that weather it is equal or not
            if(equalString(str1,str2)){

                // verifying the static method and inbuilt method 
                if (equalString(str1,str2)==str1.equals(str2)){
                    System.out.println("The method we made and inBuilt method is verified");
                }else{
                    System.out.println("The method we made and inBuilt method is not verified");
                }
            }else{
            	System.out.println("String are not equal");
            }
            
            kb.close();
        }
    }