package com.objectmodelling.selfproblem.schoolmanagment;

import java.util.ArrayList;

public class Course  {
	private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Students enroll through this method
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for(Student s : enrolledStudents) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
