
public class Divide {

    public static void main(String args[]) {

     //create this variable 
     int pen=14;
     int person=3;

     // logic for calculating the no of the pen divided equally
     int remainingPen=pen%person;
     int dividedPen=(pen-remainingPen)/person;

     /* Resultant of the program that calculate the no of pen divided equally to each person */
     System.out.println("The No. pen divided Equally to every person  "+ dividedPen  + " , The No. pen remaining after dividing equally to each Person "+ remainingPen);

    }
	
 }