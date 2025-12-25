


/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. */



import java.util.Scanner;

public class StudentScoreCard {

    // a) Generate random 2 digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41 + 60); // random 60–100
            }
        }
        return scores;
    }

    // b) Calculate total, average, percentage (rounded to 2 decimals)
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return result;
    }

    // c) Calculate grade
    public static String[] calculateGrades(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 80) grade[i] = "A";
            else if (percent >= 70) grade[i] = "B";
            else if (percent >= 60) grade[i] = "C";
            else if (percent >= 50) grade[i] = "D";
            else if (percent >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // d) Display scorecard
    public static void display(
            int[][] scores,
            double[][] result,
            String[] grades) {

        System.out.println("\n---------------- STUDENT SCORECARD ----------------");
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]
            );
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateScores(n);
        double[][] res = calculateResults(marks);
        String[] grade = calculateGrades(res);

        display(marks, res, grade);

        sc.close();
    }
}
