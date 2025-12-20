import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Error: Please enter a positive integer less than 100.");
            return;
        }

        //  Loop backward from 100 to 1
        System.out.println(" Multiples of " + number + " below 100:");

        for (int i = 100; i >= 1; i--) {

            //  Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
