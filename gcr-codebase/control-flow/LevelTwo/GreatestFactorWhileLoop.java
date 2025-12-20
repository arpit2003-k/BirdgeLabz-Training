import java.util.*;

    public class GreatestFactorWhileLoop{

        public static void main(String []args ){

            Scanner kb=new Scanner(System.in);

            System.out.println("Enter The Number for finding the Greatest factor :");
            int number= kb.nextInt();
            int greatestfactor=1;

                if(number>0){
                   System.out.println("The Greatest factor of given Number:");
                   int i=number-1;

                    while(i>=1){

                       if(number%i==0&&i!=number){
                         System.out.println( i );
                         break;
                       }
                       i--;
                    }
                }else{
                    System.out.println("The Number is not positive ");
                }
            kb.close(); 
        }   

    }