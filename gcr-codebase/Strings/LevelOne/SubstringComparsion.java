/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.*;

    public class SubstringComparsion{
        
        //Method for return substring of string from the starting to end index excusively
        public static String checkSubstring(String str,int start,int endExclusive){
            String subString="";
                for(int i=start;i<endExclusive;i++){
                    subString+=str.charAt(i);
                }
            return subString;    
        }

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

        public static void main(String []args){

             //creating the scanner object
             Scanner kb=new Scanner(System.in);

             //Taking the input
             System.out.println("Enter the String :"); 
             String str=kb.next();
             System.out.println("Enter the start index :");
             int start =kb.nextInt();
             System.out.println("Enter the end index  :");
             int endExclusive=kb.nextInt();

             String substring1=str.substring(start,endExclusive);
             String substring2=checkSubstring(str,start,endExclusive);

             //check that weather the substrings are equal and verfiyed;



                if(equalString(substring1,substring2)){
                     System.out.println("The String method is verifed by the comparsion of the inbulit method ");
                }else{
                     System.out.println("The String method is Not verifed by the comparsion of the inbulit method ");
                }

            kb.close();
        }

    }