import java.util.Scanner;

public class SpringSeason {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input of Number in the varible 
           int month =kb.nextInt();
           int day =kb.nextInt();

         //checking the Num is Natural or Not and printing the result 
           if ((month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20)){
            System.out.println("Its a Spring Season ");
           }  
           else{
            System.out.println("Its a Not Spring Season");
           } 

        kb.close();     
    }	
}