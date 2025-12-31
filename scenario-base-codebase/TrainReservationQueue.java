 /*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.*;

public class TrainReservationQueue {

    public static void main(String args[]) {

        Scanner kb = new Scanner(System.in);

        int maxTier1AC = 20;
        int maxTier2AC = 30;
        int maxTier3AC = 40;
        int max2SL = 50;

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("WELCOME to the Train Reservation Queue ");
        System.out.println("Available Seats:");
        System.out.println("Tier1AC : " + maxTier1AC);
        System.out.println("Tier2AC : " + maxTier2AC);
        System.out.println("Tier3AC : " + maxTier3AC);
        System.out.println("2SL     : " + max2SL);
        System.out.println("-------------------------------------------------------------------------------------------");

        while (true) {

            int totalOccupancy = maxTier1AC + maxTier2AC + maxTier3AC + max2SL;

            if (totalOccupancy == 0) {
                System.out.println("All seats are booked. No vacancies left.");
                break;
            }

            System.out.println("\nMenu:");
            System.out.println("1. BookTicket");
            System.out.println("2. SeatAvailability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String option = kb.nextLine().trim();

            switch (option) {

                case "1":
                case "BookTicket":
                    System.out.println("Choose Coach:");
                    System.out.println("1. Tier1AC");
                    System.out.println("2. Tier2AC");
                    System.out.println("3. Tier3AC");
                    System.out.println("4. 2SL");
                    System.out.print("Enter choice: ");

                    String coach = kb.nextLine().trim();

                    System.out.print("Enter number of seats to book: ");
                    int seat = kb.nextInt();
                    kb.nextLine(); // clear buffer

                    if (seat <= 0) {
                        System.out.println("Invalid seat count.");
                        break;
                    }

                    switch (coach) {

                        case "1":
                        case "Tier1AC":
                            if (seat <= maxTier1AC) {
                                maxTier1AC -= seat;
                                System.out.println("Booked " + seat + " seats in Tier1AC");
                            } else System.out.println("Not enough seats!");
                            break;

                        case "2":
                        case "Tier2AC":
                            if (seat <= maxTier2AC) {
                                maxTier2AC -= seat;
                                System.out.println("Booked " + seat + " seats in Tier2AC");
                            } else System.out.println("Not enough seats!");
                            break;

                        case "3":
                        case "Tier3AC":
                            if (seat <= maxTier3AC) {
                                maxTier3AC -= seat;
                                System.out.println("Booked " + seat + " seats in Tier3AC");
                            } else System.out.println("Not enough seats!");
                            break;

                        case "4":
                        case "2SL":
                            if (seat <= max2SL) {
                                max2SL -= seat;
                                System.out.println("Booked " + seat + " seats in 2SL");
                            } else System.out.println("Not enough seats!");
                            break;

                        default:
                            System.out.println("Invalid coach");
                    }

                    break;

                case "2":
                case "SeatAvailability":
                    System.out.println("\nCurrent Availability:");
                    System.out.println("Tier1AC : " + maxTier1AC);
                    System.out.println("Tier2AC : " + maxTier2AC);
                    System.out.println("Tier3AC : " + maxTier3AC);
                    System.out.println("2SL     : " + max2SL);
                    System.out.println("Total   : " + totalOccupancy);
                    break;

                case "3":
                case "Exit":
                    System.out.println("Thank you for using Train Reservation Queue!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }

        kb.close();
    }
}
