/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.*;

public class FitnessTracker{
	
	public static void averageAndTotal(int arr[]){

        int sum=0;
        for(int x:arr){
            sum+=x;
        }

        System.out.println("The  the total Number  of the pushUps for the week :  "+ sum );
        System.out.println("The the Average Number of the pushUps for the week :  "+ sum/(arr.length-1) );
	}

	public static void main(String args []){

	    //creating scanner object...
	    Scanner kb=new Scanner(System.in);
                
        //Rest day in Thrusday which is 5th day in the week
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Enter the Day when Sandeep Take Rest once in week ----"); 
        int restDay=kb.nextInt();
        System.out.println("---------------------------------------------------------------------------------");

        //creating an array 7 for a week tracking 
        int pushUp[]=new int[7];

            //taking input in the array pushUp storing the number pushUp in the day for a whole week
	        for(int i=0;i<pushUp.length;i++){

	            if(i==restDay-1){
                   continue;
	            }else{
	               System.out.println("Enter the Number of the PushUp of Day "+(i+1));
	               pushUp[i]=kb.nextInt();
	            }
            }
        System.out.println("---------------------------------------------------------------------------------");
        averageAndTotal(pushUp);
        System.out.println("---------------------------------------------------------------------------------");
	}
}