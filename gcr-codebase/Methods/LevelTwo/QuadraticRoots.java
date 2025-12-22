/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + 2Root(delta))/(2*a) 
root1 of x = (-b - 2Root(delta))/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots

*/

import java.util.Scanner;

public class QuadraticRoots {

    public static double[] findRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            return new double[0]; // empty array: no real roots
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};  // one root
        }
        else {
            double sqrtD = Math.sqrt(delta);
            double r1 = (-b + sqrtD) / (2 * a);
            double r2 = (-b - sqrtD) / (2 * a);
            return new double[]{r1, r2};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0)
            System.out.println("No real roots.");
        else if (roots.length == 1)
            System.out.println("One root: " + roots[0]);
        else
            System.out.println("Two roots: " + roots[0] + " , " + roots[1]);
    }
}
