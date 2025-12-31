/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.util.*;
public class LibraryReminderApp{
	
	public static void main(String args[]){

	   Scanner sc=new Scanner(System.in);
	   int totalFine = 0;
       
       System.out.println("-------------------------------------------------------------------------------------------");
       System.out.println("WELCOME to the Library Reminder Application ");
       System.out.println("-------------------------------------------------------------------------------------------");
       
       for(int i = 1; i <= 5; i++) {

            System.out.println("\nEnter details for Book " + i + ":");

            System.out.print("Enter Due Date (in days like 10, 15 etc): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date: ");
            int returnDate = sc.nextInt();

            System.out.println("-------------------------------------------------------------------------------------------");

            int fine = 0;

            if(returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                fine = lateDays * 5;
                System.out.println("Book " + i + " returned late by " + lateDays + " days.");
                System.out.println("Fine for this book = ₹" + fine);
                System.out.println("-------------------------------------------------------------------------------------------");
            } 
            else {
                System.out.println("Book " + i + " returned on time. No fine.");
                System.out.println("-------------------------------------------------------------------------------------------");
            }

            totalFine += fine;
        }

        System.out.println("\n----------------------------------");
        System.out.println("Total Fine to be Paid = ₹" + totalFine);
        System.out.println("Thank you for using the Library Reminder App!");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        sc.close();

	}
}