/*4. Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.*/


import java.util.Scanner;



public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial smart card balance
        double balance = 500.0;

        System.out.println(" Welcome to Delhi Metro Smart Card System ");
        System.out.println("Initial Card Balance: ₹" + balance);

        // Loop runs until balance becomes zero or user chooses to exit
        while (balance > 0) {

            System.out.print("\nEnter distance traveled (in km): ");
            int distance = sc.nextInt();

            /*
             Fare calculation using ternary operator
              Fare Rules:
              Up to 5 km   : ₹10
              6 to 15 km  : ₹20
              Above 15 km : ₹30
             */
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            // Check if sufficient balance is available
            if (balance < fare) {
                System.out.println("Insufficient balance!");
                break;
            }

            // Deduct fare from balance
            balance -= fare;

            // Display trip details
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare deducted: ₹" + fare);
            System.out.println("Remaining balance: ₹" + balance);

            // Ask user if they want to continue
            System.out.print(" Do you want to travel again? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        // Final message
        System.out.println(" Thank you for using Delhi Metro Smart Card ");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}