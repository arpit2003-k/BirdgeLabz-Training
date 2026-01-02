package com.constructor.accessmodifiers;

public class SavingsAccount extends BankAccount {
	private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void showSavingsAccountDetails() {
        System.out.println("Savings Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);           // protected
        System.out.println("Current Balance: " + getBalance());           // via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }

}
