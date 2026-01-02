package com.constructor.accessmodifiers;

public class Student {
	
	// Public → accessible anywhere
    public int rollNumber;

    // Protected → accessible in same package & subclasses
    protected String name;

    // Private → only inside this class
    private double cgpa;

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public Getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public Setter for CGPA (with validation)
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + cgpa);
        System.out.println("--------------------------------");
    }

}
