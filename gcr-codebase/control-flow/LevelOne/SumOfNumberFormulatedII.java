/*import java.util.Scanner;

public class SumOfNumberFormulatedII {

     public static void main(String args[]) {
    
           Scanner kb=new Scanner(System.in);

         // Taking input 
           System.out.println("Enter The Number ");
            
            int number=kb.nextInt();

            if(number>0){
                int sum =0;
                int sumF=((number*(number-1))/2);
                for(int i = 1; i <= number;i--){
                    sum+=i;
                }
                
                if(sum==sumF) {
                   System.out.println("The sum N Natural numbers is : " + sum);
                }else{
                    System.out.println("The sum N Natural numbers is not equal");
                }

            }
            else{
                System.out.println("The N is Not a Natural numbers ");
            }

        kb.close();     
    }	
}*/




import java.util.Scanner;

public class SumOfNumberFormulatedII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n > 0) {

            // Sum using for loop
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Sum using formula
            int sumFormula = (n * (n + 1)) / 2;

            // Display both results
            System.out.println("Sum using for loop     : " + sumFor);
            System.out.println("Sum using formula      : " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Result is correct. Both computations are equal.");
            } else {
                System.out.println("Result is incorrect. Computations do not match.");
            }

        } else {
            System.out.println("The given number is not a natural number.");
        }

        sc.close();
    }
}
