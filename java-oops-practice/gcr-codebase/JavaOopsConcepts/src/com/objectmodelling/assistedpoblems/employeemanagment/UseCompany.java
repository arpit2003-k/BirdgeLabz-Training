package com.objectmodelling.assistedpoblems.employeemanagment;

public class UseCompany {
	public static void main(String[] args) {

        Company tcs = new Company("TCS");

        // Add departments (created ONLY by Company)
        Department hr = tcs.addDepartment("HR");
        Department it = tcs.addDepartment("IT");

        // Add employees (created ONLY inside Department)
        hr.addEmployee("Rohan");
        hr.addEmployee("Priya");

        it.addEmployee("Aman");
        it.addEmployee("Shreya");

        tcs.showCompanyStructure();

        // Now delete company
        tcs.closeCompany();

        tcs.showCompanyStructure(); // Shows empty company now
    }
}
