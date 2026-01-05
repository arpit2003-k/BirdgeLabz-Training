package com.objectmodelling.assistedpoblems.bankingsystem;
import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nAccount details for " + customerName + ":");
        for (Account a : accounts) {
            System.out.println("Bank: " + a.getBank().getBankName() +
                    " | Balance: " + a.getBalance());
        }
    }

    public String getCustomerName() {
        return customerName;
    }
}
