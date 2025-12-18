import java.util.Scnanner;

public class SmallestOne {
   
   public static void main(String []args){

      Scanner kb=new Scanner(System.in);

       // take the input of 3 numbers
       System.out.println("Enter the first Number : ");
       int number1=kb.nextInt();
       System.out.println("Enter the second Number : ");
       int number2=kb.nextInt();
       System.out.println("Enter the Third Number : ");
       int number3=kb.nextInt();

       //checking the greater Number
       
          System.out.println("Is The first Number is Smallest ? "+ (number1<number2)&&(number1<number3))
        
       
   }
}