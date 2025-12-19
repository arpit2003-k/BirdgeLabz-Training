 import java.util.Scanner;

   public class StoreAndDisplay{

       public static void main(String []args){

           Scanner kb=new Scanner(System.in);

             double value []=new double [10];
             double sum=0.0;
             int j=0;

             System.out.println( "Enter the value ");
             while(true){

               double temp= kb.nextDouble();
               if(temp==0.0||j==10||temp<0.0){
                 break;
               }
               value[j]=temp;
               j++; 
             }
             for(int i=0;i<value.length;i++){
                System.out.println( "The Value of the elememts in the array is "+value[i]);
                sum+=value[i];  
              }

              System.out.println( "The Value of the sum of the elememts in the array is "+sum);

        kb.close();     
        
       }
   }