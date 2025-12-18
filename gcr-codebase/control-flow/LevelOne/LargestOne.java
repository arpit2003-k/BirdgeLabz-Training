import java.util.Scanner;

public class LargestOne {
   
   public static void main(String []args){

      Scanner kb=new Scanner(System.in);

       // take the input of 3 numbers
       System.out.println("Enter the first Number : ");
       int number1=kb.nextInt();
       System.out.println("Enter the second Number : ");
       int number2=kb.nextInt();
       System.out.println("Enter the Third Number : ");
       int number3=kb.nextInt();

       int largest;

       //checking the greater Number
       
          System.out.println("Is the first number the largest? "+(number1>number2&&number1>number3));
          System.out.println("Is the first number the largest? "+(number2>number1&&number2>number3));
          System.out.println("Is the first number the largest? "+(number3>number2&&number3>number1));
       
   }
}