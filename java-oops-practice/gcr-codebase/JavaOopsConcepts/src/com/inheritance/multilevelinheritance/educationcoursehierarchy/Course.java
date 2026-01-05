package com.inheritance.multilevelinheritance.educationcoursehierarchy;

public class Course {
	 String courseName;
	 int duration; // duration in hours

	 // Constructor
	 Course(String courseName, int duration) {
	     this.courseName = courseName;
	     this.duration = duration;
	 }

	 // Method to display course details
	 void displayDetails() {
	     System.out.println("Course Name : " + courseName);
	     System.out.println("Duration    : " + duration + " hours");
	 }
}
