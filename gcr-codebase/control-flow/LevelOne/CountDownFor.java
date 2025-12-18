import java.util.Scanner;

public class CountDownFor {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           int counter =kb.nextInt();

           for(int i=counter;i>=1;i--){
            System.out.println("The CountDown "+ i);
           }   

        kb.close();     
    }	
}