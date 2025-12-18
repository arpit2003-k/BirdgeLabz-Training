import java.util.Scanner;

public class CountDown {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           int counter =kb.nextInt();

           while(counter>=1){
            System.out.println("The CountDown "+ counter);
            counter--;
           }   

        kb.close();     
    }	
}