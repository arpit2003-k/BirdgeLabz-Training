/*4. Fibonacci Sequence Generator:
○ Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
○ Organize the code by creating a function that calculates and prints the Fibonacci
sequence.*/

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of terms from user
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        // Calling function
        printFibonacci(n);

        sc.close();
    }

    // Function to print Fibonacci series
    public static void printFibonacci(int n) {

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}