/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/

import java.util.Scanner;

public class BMICalcultorByAddingMethod {

    // Method to calculate BMI
    public static void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double heightCm = people[i][1];
            double heightM = heightCm / 100.0;

            people[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to get BMI Status
    public static String[] getStatus(double[][] people) {
        String[] status = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            double bmi = people[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] people = new double[10][3];

        // Input
        System.out.println("Enter weight and height of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            people[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " height (cm): ");
            people[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(people);

        // Get status
        String[] status = getStatus(people);

        // Display in simple format
        System.out.println("--- BMI REPORT ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + people[i][1] + " cm");
            System.out.println("Weight: " + people[i][0] + " kg");
            System.out.println("BMI: " + people[i][2]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
    }
}
