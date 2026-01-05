package com.objectmodelling.assistedpoblems.employeemanagment;

import java.util.ArrayList;


public class Department {
	private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    // Composition: Employees belong only to this department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void showEmployees() {
        System.out.println("\nEmployees in " + departmentName + " Department:");
        for(Employee e : employees) {
            System.out.println("- " + e.getEmployeeName());
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
