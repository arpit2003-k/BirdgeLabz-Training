/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.*;

public class CurrencyExchangeKiosk{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double inr, convertedAmount;
        String choice;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println(" Welcome to Currency Exchange Kiosk ");
            System.out.println("---------------------------------------------------");
            System.out.print("Enter the amount in INR: ");
            inr = sc.nextDouble();
            System.out.println("---------------------------------------------------");

            System.out.println("Select the currency you want to convert to:");
            System.out.println("1. USD (US Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. GBP (British Pound)");
            System.out.println("4. JPY (Japanese Yen)");
            System.out.println("---------------------------------------------------");
            System.out.print("Enter option (1–4): ");

            int option = sc.nextInt();
            System.out.println("---------------------------------------------------");

            switch (option) {
                case 1:
                    convertedAmount = inr * 0.012;   // approx rate
                    System.out.println("Converted Amount in USD: " + convertedAmount);
                    System.out.println("---------------------------------------------------");
                    break;

                case 2:
                    convertedAmount = inr * 0.011;   // approx rate
                    System.out.println("Converted Amount in EUR: " + convertedAmount);
                    System.out.println("---------------------------------------------------");
                    break;

                case 3:
                    convertedAmount = inr * 0.0096;  // approx rate
                    System.out.println("Converted Amount in GBP: " + convertedAmount);
                    System.out.println("---------------------------------------------------");
                    break;

                case 4:
                    convertedAmount = inr * 1.40;    // approx rate
                    System.out.println("Converted Amount in JPY: " + convertedAmount);
                    System.out.println("---------------------------------------------------");
                    break;

                default:
                    System.out.println(" Invalid option selected.");
                    System.out.println("---------------------------------------------------");
            }

            System.out.print("Do you want to convert another amount? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Currency Exchange Kiosk ");
        System.out.println("---------------------------------------------------");
        sc.close();
    }
}

