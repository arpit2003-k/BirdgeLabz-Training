import java.util.*;

     public class PowerWhile{

         public static void main(String []args){

             Scanner kb=new Scanner(System.in);

             System.out.println("Enter the base Number :");
             int number =kb.nextInt();
             System.out.println("Enter the Power: ");
             int power=kb.nextInt();
             int result=1;

             int i=1;

             while(i<=power){
                 result*=number;
                 i++;
             }

             System.out.println("The solution of Above problem : "+ result);
            kb.close();
         }
     }