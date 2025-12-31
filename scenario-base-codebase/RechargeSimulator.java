/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/

import java.util.*;

public class RechargeSimulator{
	
	public static void main(String args[]){

	    Scanner kb=new Scanner(System.in);
	    System.out.println("------------------------------------------------------------------------");
	    System.out.println("Enter the Service provider Name--\n1.Jio------\n2.Airtel------\n3.VodaphoneIdea(VI)-----\n4.Exit------");
	    String serviceProvider=kb.nextLine().trim();
	    int amount=0;

	    System.out.println("------------------------------------------------------------------------");

	    switch(serviceProvider)
	    {
	    
	    case "Jio":
        System.out.println("The Recharge offers on the Jio Service provider are following:-------\n1. 199-Rupees---0.5GB/perDay Unlimited Out going...for 28 days----\n2. 299-Rupees---1.0GB/perDay Unlimited Out going...for 28 days----\n3. 399-Rupees---1.5GB/perDay Unlimited Out going...for 28 days----\n4. 499-Rupees---2.0GB/perDay Unlimited Out going...for 28 days----\n5. 899-Rupees---2.0GB/perDay Unlimited Out going...for 89 days---- ");
        System.out.println("Enter the RechargeAmount--");
	    amount=kb.nextInt();
	    break; 

	    case "Airtel":
	    System.out.println("The Recharge offers on the Airtel Service provider are following:-------\n1. 199-Rupees---1.0GB/perDay Unlimited Out going...for 28 days----\n2. 299-Rupees---2.0GB/perDay Unlimited Out going...for 28 days----\n3. 399-Rupees---3.0GB/perDay Unlimited Out going...for 28 days----\n4. 499-Rupees---4.0GB/perDay Unlimited Out going...for 28 days----\n5. 899-Rupees---2.5GB/perDay Unlimited Out going...for 89 days---- ");
        System.out.println("Enter the RechargeAmount--");
	    amount=kb.nextInt();

	    break;

	    case "VodaphoneIdea(VI)":
	    System.out.println("The Recharge offers on the VI Service provider are following:-------\n1. 199-Rupees---0.5GB/perDay Unlimited Out going...for 28 days----\n2. 299-Rupees---1.0GB/perDay Unlimited Out going...for 28 days----\n3. 399-Rupees---1.5GB/perDay Unlimited Out going...for 28 days----\n4. 499-Rupees---2.0GB/perDay Unlimited Out going...for 28 days----\n5. 899-Rupees---2.0GB/perDay Unlimited Out going...for 89 days---- ");
        System.out.println("Enter the RechargeAmount--");
	    amount=kb.nextInt();

	    break;

	    case "Exit":
	    System.out.println("Thank you for using the RechargeSimulator --- Please visit again...");
	    System.out.println("------------------------------------------------------------------------");
        System.exit(0);
	    break;

	    default:
        System.out.println("Invalid Entry-- Try again...");
        System.out.println("------------------------------------------------------------------------");
	    continue;
	    }

	    System.out.println("------------------------------------------------------------------------");
	    while(true){
            
            System.out.println("The Customer have successfully made Recharge of Amount---"+amount+" Rupees");

            System.out.println("Would You like to Repeat the Recharge of Amount---"+amount+" Rupees Enter----> Yes / No ");
            String choice=kb.next();
            if(choice.equalsIgnoreCase("Yes")){
             continue;
            }else if(choice.equalsIgnoreCase("No")){
             System.out.println("Thank you for using the RechargeSimulator --- Please visit again...");
             System.out.println("------------------------------------------------------------------------");
             System.exit(0);
            }

	    }

	    System.out.println("------------------------------------------------------------------------");

	}
}