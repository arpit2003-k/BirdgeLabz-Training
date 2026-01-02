package com.constructor.accessmodifiers;

public class UseBankAccount {
	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("ACC12345", "Arpit Gupta", 5000.0, 4.5);

        sa.displayAccountInfo();        // From base class

        System.out.println();

        sa.showSavingsAccountDetails(); // From subclass
    }

}
