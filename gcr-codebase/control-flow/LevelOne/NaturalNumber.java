import java.util.Scanner;

public class NaturalNumber {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input of Number in the varible Num
           int number =kb.nextInt();

         //checking the Num is Natural or Not and printing the result 
           if (number>0){
            System.out.println("If the number is a positive integer then the output is The sum of "+number+" Natural Number is "+(number*(number-1))/2 );
           }
           else{
            System.out.println(" The number is not Natural Number ");    
           }  

        kb.close();     
    }	
}