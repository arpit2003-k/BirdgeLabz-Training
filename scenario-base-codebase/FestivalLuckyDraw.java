/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("Enter lucky draw number for Visitor " + i + ": ");

            // Check if the next input is an integer
            

            int number = sc.nextInt();
            if (number>=0||number<0) {
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("Congratulations! You won a gift!");
                }else {
                    System.out.println("Better luck next time!");
                }

            System.out.println("-----------------------------");
                    
            }else{
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next();   // Clear invalid input
                i--;         // Retry same visitor
                continue;    // Skip to next loop iteration
            }

           
            
        }

        sc.close();
    }
}
