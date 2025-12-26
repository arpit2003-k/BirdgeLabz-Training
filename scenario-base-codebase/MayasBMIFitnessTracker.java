/*Problem 2: Maya’s BMI Fitness Tracker

Maya is a fitness coach who wants to calculate BMI for her clients.

Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. Use meaningful variable names and proper comments to maintain clean code.*/

import java.util.*;

// Creating a public class
public class MayasBMIFitnessTracker {

    // Main method
    public static void main(String args[]) {

        // Scanner object is created to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking height input in meters
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();

        // Taking weight input in kilograms
        System.out.println("Enter your weight in kilograms:");
        double weight = sc.nextDouble();

        // Calculating BMI using formula
        // BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Displaying the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Checking BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing the scanner
        sc.close();
    }
}