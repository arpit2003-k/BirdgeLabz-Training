package com.constructor.accessmodifiers;

public class PostgraduateStudent extends Student{
	
	private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void showPGDetails() {
        // name is protected → allowed
        System.out.println("PG Student Name : " + name);

        // rollNumber is public → allowed
        System.out.println("Roll Number     : " + rollNumber);

        // specialization is private to this class
        System.out.println("Specialization  : " + specialization);

        // CGPA must be accessed via getter (because it is private)
        System.out.println("CGPA            : " + getCGPA());

        System.out.println("--------------------------------");
    }
}
