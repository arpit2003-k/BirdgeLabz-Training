import java.util.*;

 public class Table{
    
    public static void main(String []args){

       Scanner kb=new Scanner(System.in);

       System.out.println(" Enter the Number ");
       int number = kb.nextInt();
       int table []=new int[10];

         

         for(int i=1;i<=10;i++){
           table[i-1]=i*number;
         }

         System.out.println(" The Table of the Number "+number+" is Listed below ");

       for (int i=1;i<=10;i++){
          System.out.println(number+"*"+i+" = "+table[i-1]);
       }

        kb.close();

    }
 }