

import java.util.Scanner;

public class SumOfNNumberFormulated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n > 0) {

            // Sum using while loop
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Sum using formula
            int sumFormula = (n * (n + 1)) / 2;

            // Display both results
            System.out.println("Sum using while loop   : " + sumWhile);
            System.out.println("Sum using formula      : " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
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
