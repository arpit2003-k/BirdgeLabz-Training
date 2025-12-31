/*----7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.----*/

import java.util.*;

public class GuessTheNumber{
	
	public static void main(String args[]){

	    //Creating the scanner Object-
	    Scanner kb=new Scanner(System.in);
        
        //The Total Number pf attempt--
	    int attempt=5;
	    Random random=new Random();
	    int Number=random.nextInt(100)+1;

	    System.out.println("\n\n-----WELCOME to the Number Guessing Games Between 1-100 You have "+attempt+" Attempt-----");
	        
	        do{
                 if (attempt==0){
                     System.out.println("Bad Luck You have lose the Game you have 0 Attempt");
                     System.exit(0);
                 }
                 System.out.println("--------------------------------------------------------------------------------");
	             System.out.println("Enter the Number--");
	             int guessNumber=kb.nextInt();
	                 if(guessNumber==Number){
                         System.out.println("Congratulations You have win the Game You have Guesse The Right Number---");
                         System.out.println("\n--------------------------------------------------------------------------------");
                         System.exit(0);
	                 }else if(guessNumber>Number){
	                 	 System.out.println("--Too High-- ");
	                 	 attempt--;
                         System.out.println("--- You have Just "+attempt+" attempts left---");
                         
	                 }else if(guessNumber<Number){
	                 	 System.out.println("--Too Low-- ");
	                 	 attempt--;
                         System.out.println("--- You have Just "+attempt+" attempts left---");
                         
	                 }
	        
	        }while(true);
	    
	}
}