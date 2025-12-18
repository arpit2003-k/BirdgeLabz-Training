import java.util.Scanner;

public class CheckEligbility {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input of Number in the varible Num
           System.out.println(" Enter the age  ");
           int age =kb.nextInt();

         //checking the Num is Natural or Not and printing the result 
           if (age>18){
            System.out.println("The person's age is "+age+" and can vote. ");
           }
           else{
            System.out.println("The person's age is "+age+" and can not vote. ");    
           }  

        kb.close();     
    }	
}