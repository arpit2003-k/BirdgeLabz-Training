package com.constructor.accessmodifiers;

public class BankAccount {
	
	public String accountNumber;     // Public: accessible everywhere
    protected String accountHolder;  // Protected: accessible in subclass + same package
    private double balance;          // Private: only inside this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }


    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

}
