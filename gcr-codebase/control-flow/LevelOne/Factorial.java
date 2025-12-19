import java.util.Scanner;

public class Factorial {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           System.out.println("Enter The Number ");
            
            int number=kb.nextInt();
            int fact=1;

            if(number>=1){
                
                while(number>=1){
                    fact*=number;
                    number--;
                }
                
                System.out.println("The Factorial for N number is: "+ fact);
            }

        kb.close();     
     }	
}