/*----8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.

total bill>10000----> 10% Discount
total bill>7000----> 5% Discount
total bill>3000----> 2% Discount*/

import java.util.*;

public class ShopkeeperDiscount{

    public static double discountCalculator(int totalBill){

        if(totalBill>10000){
             return 0.10*totalBill;
        }else if(totalBill>7000){
             return 0.05*totalBill;
        }else if(totalBill>3000){
             return 0.02*totalBill;
        }

        return 0;
    }
	
	public static void main(String []args){
        
        //Created the scanner Object
	    Scanner kb=new Scanner(System.in);

	    int totalPrice=0;
        System.out.println("--------------------------------------------------------------------------------");
	    for(int i=1;;i++){

	        System.out.println("Enter the Price of item number "+i+". or Enter Zero to Calculate the Total Bill...");
	        int price=kb.nextInt();
	        if(price==0){
	        	break;
	        }
	        totalPrice+=price;
	    }
	    System.out.println("--------------------------------------------------------------------------------");

	    System.out.println("The Discount Given to the customer for Buying the Item of "+totalPrice+" Rupees is-->> "+discountCalculator(totalPrice));
	    System.out.println("The Amount to Be paid after the Discount---->> "+ (totalPrice-discountCalculator(totalPrice))+" Rupees..");

	    System.out.println("--------------------------------------------------------------------------------");



	}
}