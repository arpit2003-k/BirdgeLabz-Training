/*---Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/
  import java.util.*;

      public class Bounus{

          public static void main(String []args){

              Scanner kb=new Scanner(System.in);

              int bonus=0;

              System.out.println("Enter the Salary ");
              int salary=kb.nextInt();
              System.out.println("Enter the service Year ");
              int service=kb.nextInt();

              if (service > 5) {
                bonus = salary * 0.05;
              } 
              

              System.out.println("The Bonus given to the Empolyee is -- "+ bonus);

              kb.close();
          }
      } 
