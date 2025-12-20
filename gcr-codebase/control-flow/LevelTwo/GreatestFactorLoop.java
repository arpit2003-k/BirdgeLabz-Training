import java.util.*;

    public class GreatestFactorLoop{

        public static void main(String []args ){

            Scanner kb=new Scanner(System.in);

            System.out.println("Enter The Number for finding the Greatest factor :");
            int number= kb.nextInt();
            int greatestfactor=1;

                if(number>0){
                   System.out.println("The Greatest factor of given Number:");

                    for(int i=number;i>=1;i--){

                       if(number%i==0&&i!=number){
                         System.out.println( i );
                         break;
                       }
                    }
                }else{
                    System.out.println("The Number is not positive ");
                }
            kb.close(); 
        }   

    }