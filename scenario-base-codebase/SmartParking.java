/*---6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
 ----scenarion Based Question---*/

 import java.util.*;

 public class SmartParking{

     //main Method inside the class
     public static void main(String args[]){

         //creating the Scanner object
         Scanner kb=new Scanner(System.in);

         int occupancy=0;
         int maxOccupency=6;

         System.out.println("-----Welcome To Parking area-----");
             while(true){

                 if(occupancy>=maxOccupency){
                     System.out.println("Ther parking Lot is Full---");
                     System.exit(0);
                 }

                 System.out.println("-----------------------------");

                 System.out.println("Choose an option:\n1. Park\n2. Exit\n3. Show Occupancy");

                 String option=kb.nextLine().trim();

                 
                 
                 switch(option){

                     case "Park":
                     System.out.println("Vehical Parked Safely");
                     occupancy++;
                     System.out.println("-----------------------------");
                     break;

                     case "Show Occupancy":
                     System.out.println("The Parking area have "+occupancy+" Vehicals--");
                     System.out.println("-----------------------------");
                     break;

                     case "Exit":
                     System.out.println("Check out from the option-");
                     System.out.println("-----------------------------");
                     System.exit(0);
                     break;

                     default:
                     System.out.println("INVALID Choice--Choose the Rigth Option--");
                     break;

                 }


             }



     }
 }