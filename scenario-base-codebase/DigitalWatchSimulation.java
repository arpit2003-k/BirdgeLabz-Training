/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.*;

public class DigitalWatchSimulation{
	
	public static void main(String args[]){

	System.out.println("-------------------------------------------------------------------------------------------");
    System.out.println("********* The Digital Watch Simulator ********");
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.println("-------------------------------------------------------------------------------------------");

	    for(int i=0;i<24;i++){
	        if(i==13){
	        System.out.println("The Simulate Power cut................");
	        break;
	        }
	        int hours=i;
	        
	        for(int j=0;j<60;j++){
	            int mintues=j;

	            if(j==0){
	                System.out.println("The Time is "+i+" O' Clock");
	                System.out.println("-------------------------------------------------------------------------------------------");
	            }else{
	                System.out.println("The Time is "+i+" hour "+j+" minutes.");
	                System.out.println("-------------------------------------------------------------------------------------------");
	            }

	        }

	    }
	    System.out.println("-------------------------------------------------------------------------------------------");

	}
}