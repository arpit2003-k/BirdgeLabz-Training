import java.util.Scanner;

public class CheckNumber {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input of Number in the varible Num
           int number =kb.nextInt();

         //checking the Num is Natural or Not and printing the result 
           if (number>0){
            System.out.println("The number is a positive integer ");
           }
           else if(number<0){
            System.out.println(" The number is a Negative integer ");    
           }else{
            System.out.println(" The number is a Zero ");
           } 

        kb.close();     
    }	
}