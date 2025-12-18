import java.util.Scanner;

public class CheckDivisblity {

     public static void main(String args[]) {
    
         Scanner kb=new Scanner(System.in);

         // Taking input of Number in the varible Num
         int number =kb.nextInt();

         //checking the Num is divisble of 5 or Not and printing the result 
        
           System.out.println(" Is the Number "+" number"+" Divisble by 5? "+ (number%5==0) );
      
         kb.close();

     }
	
}