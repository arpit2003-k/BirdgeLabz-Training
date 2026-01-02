package com.constructor.accessmodifiers;

public class UseStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "Arpit", 8.5);
        s1.displayDetails();

        // Modify CGPA using public method
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println("--------------------------------");

        PostgraduateStudent pg = new PostgraduateStudent(201, "Rohan", 8.9, "Data Science");
        pg.showPGDetails();

        // Updating CGPA from subclass object
        pg.setCGPA(9.5);
        System.out.println("Updated PG CGPA: " + pg.getCGPA());
	}

}
