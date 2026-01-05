package com.objectmodelling.assistedpoblems.employeemanagment;

import java.util.ArrayList;


public class Company {
	private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // Composition: Departments belong ONLY to this company
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void showCompanyStructure() {
        System.out.println("\nCompany: " + companyName);
        for(Department d : departments) {
            System.out.println("\nDepartment: " + d.getDepartmentName());
            d.showEmployees();
        }
    }

    // Simulate delete → clearing all owned objects
    public void closeCompany() {
        System.out.println("\nClosing company... deleting all departments & employees.");
        departments.clear();
    }
}
