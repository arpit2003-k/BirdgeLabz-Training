package com.objectmodelling.selfproblem.universitymanagment;

public class UseUniversity {
	public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Verma");

        // Create University
        University uni = new University("ABC University");

        // Add Departments (Composition)
        uni.addDepartment(new Department("Computer Science"));
        uni.addDepartment(new Department("Mechanical Engineering"));

        // Add Faculty (Aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show Details
        uni.showUniversityDetails();

        // Closing University
        uni.closeUniversity();

        // Faculty STILL EXISTS
        System.out.println("\nFaculty members still exist independently:");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }
}
