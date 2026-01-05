package com.objectmodelling.assistedpoblems.bankingsystem;

public class UseBank {
	public static void main(String[] args) {

        Bank sbi = new Bank("SBI Bank");
        Bank hdfc = new Bank("HDFC Bank");

        Customer rohan = new Customer("Rohan");
        Customer priya = new Customer("Priya");

        // Customers open accounts (Association in action)
        sbi.openAccount(rohan, 5000);
        hdfc.openAccount(rohan, 12000);

        sbi.openAccount(priya, 8000);

        // Customers check balances
        rohan.viewBalance();
        priya.viewBalance();
    }
}
