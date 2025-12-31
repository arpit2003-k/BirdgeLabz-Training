/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/

import java.util.*;


public class BusAttendance{
	
	public static void main(String [] args){

	    Scanner kb=new Scanner(System.in);

	    String students[]=new String[10];

	    int present=0;
	    int absent=0;

	    for(int i=0;i<students.length;i++){
	        System.out.println("Is student Number "+(i+1)+" is Present or Absent--");
	        students[i]=kb.next();
	    }

	    for(String x:students){
	        if(x.equals("Present")){
                present++;
	        }else if(x.equals("Absent")){
	            absent++;
	        }
	    }

	    System.out.println("The Number of student Present in the Bus is "+present);
	    System.out.println("The Number of student absent in the Bus is "+absent);
	}
}