package com.constructor.accessmodifiers;

public class Employee {
	
	public int employeeID;
	protected String department;
	private double salary;
	
	
	
	public Employee(int employeeID, String department, double salary) {
		super();
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	public void displayEmployeeDetails() {
		System.out.println("The Employee Empolyee ID "+employeeID);
		System.out.println("The Employee department  "+department);
		System.out.println("The Employee salary "+getSalary());
	}

	public void modifySalary(double salary) {
 		this.salary=salary;
		
	}
	
	public double getSalary() {
		return salary;
	}
	

}
