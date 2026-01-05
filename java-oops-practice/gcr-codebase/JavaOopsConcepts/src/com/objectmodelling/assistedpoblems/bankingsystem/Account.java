package com.objectmodelling.assistedpoblems.bankingsystem;

public class Account {
	private Customer customer;   // linked to Customer
    private Bank bank;           // linked to Bank
    private double balance;

    public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;

        customer.addAccount(this);   // maintain association both sides
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
