package com.objectmodelling.assistedpoblems.bankingsystem;
import java.util.ArrayList;

public class Bank {
	private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    // Association: Bank interacts with Account & Customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(customer, this, initialBalance);
        accounts.add(newAccount);

        System.out.println("Account opened for " + customer.getCustomerName() +
                " at " + bankName + " with balance: " + initialBalance);

        return newAccount;
    }

    public String getBankName() {
        return bankName;
    }
}
