/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/

import java.util.Scanner;

public class SumOfNaturalNumbersCompare {

    public static int sumUsingRecursion(int n) {
        if (n == 0)
            return 0;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum1 = sumUsingRecursion(n);
        int sum2 = sumUsingFormula(n);

        System.out.println("Sum using recursion = " + sum1);
        System.out.println("Sum using formula = " + sum2);
        System.out.println("Both results are equal: " + (sum1 == sum2));
    }
}
