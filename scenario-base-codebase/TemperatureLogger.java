/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/


import java.util.*;

public class TemperatureLogger{

    public static void averageTemperature(double temperature[]){

        double average=0;
        for(int i=0;i<temperature.length;i++){
            average+=temperature[i];
        }

        System.out.println("\nThe average Temperature is -- "+(average/temperature.length)); 
    }

    public static void maxTemperature(double temperature[]){

        Arrays.sort(temperature);
        System.out.println("\nThe Highest Temperature in the Last seven days was----->  "+temperature[temperature.length-1]);
    }

	
	public static void main(String args[]){

        //Creating the scanner object	   
	    Scanner kb=new Scanner(System.in);

        //creating an array of 7 to store the temperature of last 7 days
	    double temperature[]=new double[7];
        
        //Taking Input of Seven Days in an array 
        for(int i=0;i<temperature.length;i++){
            System.out.println("Enter the Temperature of Day "+ (i+1));
            temperature[i]=kb.nextDouble();
        }
    
	averageTemperature(temperature);
	maxTemperature(temperature);    
	}
}