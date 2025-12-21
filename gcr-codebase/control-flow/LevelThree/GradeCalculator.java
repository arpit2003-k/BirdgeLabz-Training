/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Physics marks: ");
        double p = sc.nextDouble();
        System.out.print("Chemistry marks: ");
        double c = sc.nextDouble();
        System.out.print("Maths marks: ");
        double m = sc.nextDouble();

        double avg = (p + c + m) / 3;
        System.out.println("Average = " + avg);

        if (avg >= 80)
            System.out.println("Grade A");
        else if (avg >= 70)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 50)
            System.out.println("Grade D");
        else if (avg >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");
    }
}
