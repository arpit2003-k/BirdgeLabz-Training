/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double totalDistance = 0.0;
        double distanceBetweenStops = 2.5;   
        int stopNumber = 1;

        System.out.println("----------------------------------------------------");
        System.out.println(" Welcome to Bus Route Distance Tracker");
        System.out.println("----------------------------------------------------");

        while (true) {

            System.out.println("\nBus reached Stop " + stopNumber);
            totalDistance += distanceBetweenStops;
            System.out.println("Distance covered so far: " + totalDistance + " km");
            System.out.println("----------------------------------------------------");

            System.out.print("Do you want to get off here? (yes/no): ");
            String choice = kb.next().toLowerCase();
            System.out.println("----------------------------------------------------");

            if (choice.equals("yes")) {
                System.out.println("\n You got off the bus at Stop " + stopNumber);
                System.out.println("Total distance travelled: " + totalDistance + " km");
                System.out.println("----------------------------------------------------");
                break;   // exit loop
            } 
            else if (choice.equals("no")) {
                stopNumber++;   // continue to next stop
            } 
            else {
                System.out.println(" Invalid input! Please enter yes or no.");
                System.out.println("----------------------------------------------------");
            }
        }

        kb.close();
    }
}
