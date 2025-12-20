 import java.util.*;

     public class Power{

         public static void main(String []args){

             Scanner kb=new Scanner(System.in);

             System.out.println("Enter the base Number :");
             int number =kb.nextInt();
             System.out.println("Enter the Power: ");
             int power=kb.nextInt();
             int result=1;

             for(int i=1;i<=power;i++){
                 result*=number;
             }

             System.out.println("The solution of Above problem : "+ result);
            kb.close();
         }
     }