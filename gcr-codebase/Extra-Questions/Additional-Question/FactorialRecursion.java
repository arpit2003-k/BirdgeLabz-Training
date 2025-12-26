/*Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.*/

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Calling recursive function
        int result = factorial(num);

        System.out.println("Factorial is: " + result);

        sc.close();
    }

    // Recursive function to calculate factorial
    public static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }
}