/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 
*/

import java.util.Scanner;

public class BMICalculatorString {

    // a) Take input & store weight + height in 2D String array
    public static String[][] inputData(int n) {
        Scanner sc = new Scanner(System.in);
        String[][] data = new String[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.next();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.next();
        }
        return data;
    }

    // b) Calculate BMI + Status
    public static String[][] calcBMI(String[][] hw) {
        String[][] result = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {

            double weight = Double.parseDouble(hw[i][0]);
            double heightCm = Double.parseDouble(hw[i][1]);
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = hw[i][0];      // weight
            result[i][1] = hw[i][1];      // height
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // c + d) Display table
    public static void display(String[][] res) {

        System.out.println("\n---------------- BMI REPORT ----------------");
        System.out.println("Wt(kg)\tHt(cm)\tBMI\tStatus");
        System.out.println("--------------------------------------------");

        for (String[] row : res) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {

        int n = 10;
        String[][] hw = inputData(n);
        String[][] bmi = calcBMI(hw);
        display(bmi);
    }
}
