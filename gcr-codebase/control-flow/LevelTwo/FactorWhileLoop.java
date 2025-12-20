import java.util.*;

    public class FactorWhileLoop{

        public static void main(String []args ){

            Scanner kb=new Scanner(System.in);

            System.out.println("Enter The Number for finding the factor :");
            int number= kb.nextInt();

                if(number>0){
                   System.out.println("The factor of given Number:");

                    int i=1;

                    while(number<= i){

                       if(number%i==0){
                         System.out.println( i );
                       }
                       i++;
                    }
                }else{
                    System.out.println("The Number is not positive ");
                }
            kb.close(); 
        }   

    }