import java.util.Scanner;

public class SumOfNumberII {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           System.out.println("Enter The Number ");
           double sum =0.0;
           double number=kb.nextDouble();

           while(true){
              if(number>0){
              sum+=number;
              number=kb.nextDouble();  
              }
              else{
                break;
              }
            
           } 
           System.out.println("The sum before entering the Zero " + sum);  

        kb.close();     
    }	
}