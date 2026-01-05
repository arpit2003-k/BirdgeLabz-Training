package com.encapsulationandpolymorphism.bankingsystem;

public interface Lonable {
	void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}
