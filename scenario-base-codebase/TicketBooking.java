/*14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/

import java.util.*;

public class TicketBooking{
    
    public static void main(String[]agrs){
        
        //creating scanner object 
        Scanner kb=new Scanner(System.in);

        int maxSeatGold=50;
        int maxSeatSilver=100;

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("WELCOME to the Movie Ticket Booking Application ");
        System.out.println("Available Seats:");
        System.out.println("Gold : " + maxSeatGold);
        System.out.println("Silver : " + maxSeatSilver);
        System.out.println("-------------------------------------------------------------------------------------------");

        while (true) {

            int total=maxSeatGold+maxSeatSilver;

            if ( total== 0) {
                System.out.println("All seats are booked. No vacancies left.");
                break;
            }

            System.out.println("\nMenu:");
            System.out.println("1. Book-Movie-Ticket");
            System.out.println("2. Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String option = kb.nextLine().trim();

            switch (option) {

                case "1":
                case "Book-Movie-Ticket":
                    System.out.println("Select the Type of Movie:");
                    System.out.println("1. Romantic");
                    System.out.println("2. Horror");
                    System.out.println("3. Action");
                    System.out.println("4. Comedy");
                    System.out.print("Enter choice: ");

                    String movie = kb.nextLine().trim();

                    System.out.print("Enter number of seats to book: ");
                    int seat = kb.nextInt();
                    kb.nextLine(); // clear buffer
                    System.out.println("Enter the Type of seat you want to Book :");
                    System.out.println("1. Gold   :");
                    System.out.println("2. Silver :");
                    String type=kb.nextLine().trim();

                    if (seat <= 0) {
                        System.out.println("Invalid seat count.");
                        break;
                    }

                    switch (movie) {

                        case "1":
                        case "Romantic":
                            if ((type.equals("Gold")||type.equals("1"))&&seat <=maxSeatGold ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Gold seats ");
                            }else if((type.equals("Silver")||type.equals("2"))&&seat <=maxSeatSilver ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Silver seats for "+movie+" Movie ");
                            }else 
                                System.out.println("Not enough seats!");
                            break;

                        case "2":
                        case "Horror":
                            if ((type.equals("Gold")||type.equals("1"))&&seat <=maxSeatGold ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Gold seats ");
                            }else if((type.equals("Silver")||type.equals("2"))&&seat <=maxSeatSilver ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Silver seats for "+movie+" Movie ");
                            }else 
                                System.out.println("Not enough seats!");
                            break;

                        case "3":
                        case "Action":
                            if ((type.equals("Gold")||type.equals("1"))&&seat <=maxSeatGold ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Gold seats ");
                            }else if((type.equals("Silver")||type.equals("2"))&&seat <=maxSeatSilver ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Silver seats for "+movie+" Movie ");
                            }else 
                                System.out.println("Not enough seats!");
                            break;

                        case "4":
                        case "Comedy":
                            if ((type.equals("Gold")||type.equals("1"))&&seat <=maxSeatGold ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Gold seats ");
                            }else if((type.equals("Silver")||type.equals("2"))&&seat <=maxSeatSilver ) {
                                maxSeatGold -= seat;
                                System.out.println("Booked " + seat + " Silver seats for "+movie+" Movie ");
                            }else 
                                System.out.println("Not enough seats!");
                            break;

                        default:
                            System.out.println("Invalid Choice...");
                    }

                    break;

                case "2":
                case "Snacks":
                    System.out.println("\n---------Items Availability in Snacks ---------");
                    System.out.println("Cold Drink : = 55.00 rupees");
                    System.out.println("PopCorn    : = 30.00 rupees");
                    System.out.println("Chips      : = 40.00 rupees");
                    System.out.println("Samosa     : = 25.00 rupees");
                    break;

                case "3":
                case "Exit":
                    System.out.println("Thank you for using Movie Ticket Booking Application! ");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }

        kb.close();

    }	
}