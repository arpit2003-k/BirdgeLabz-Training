package com.constructor.accessmodifiers;

public class Manager extends Employee {

	public Manager(int employeeID, String department, double salary) {
		super(employeeID, department, salary);
		
	}
	public void displayManagerDetails() {
		System.out.println("The Manager Empolyee ID "+employeeID);
		System.out.println("The Manager department  "+department);
		System.out.println("The Manager salary "+getSalary());
	}
	
}
