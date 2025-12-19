import java.util.*;

 public class TableII{
    
    public static void main(String []args){

       Scanner kb=new Scanner(System.in);

       System.out.println(" Enter the Number ");
       int number = kb.nextInt();
       int multiplicationResult []=new int[4];

         

         for(int i=0;i<4;i++){
           multiplicationResult[i]=(i+6)*number;
         }

         System.out.println(" The Table of the Number "+number+"  from 6 to 9 is Listed below ");

       for (int i=0;i<4;i++){
          System.out.println(number+"*"+(i+6)+" = "+multiplicationResult[i]);
       }

        kb.close();

    }
 }