import java.util.*;

    public class FactorLoop{

        public static void main(String []args ){

            Scanner kb=new Scanner(System.in);

            System.out.println("Enter The Number for finding the factor :");
            int number= kb.nextInt();

                if(number>0){
                   System.out.println("The factor of given Number:");

                    for(int i=1;i<=number;i++){

                       if(number%i==0){
                         System.out.println( i );
                       }
                    }
                }else{
                    System.out.println("The Number is not positive ");
                }
            kb.close(); 
        }   

    }