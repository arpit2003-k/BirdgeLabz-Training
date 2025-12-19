import java.util.Scanner;

public class SumOfNumber {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           double sum =0.0;
           double number=kb.nextDouble();

           while(number>0||number<0){
            sum+=number;
            number=kb.nextDouble();
           } 
           System.out.println("The sum before entering the Zero " + sum);  

        kb.close();     
    }	
}