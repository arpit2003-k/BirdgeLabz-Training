package com.objectmodelling.selfproblem.schoolmanagment;

import java.util.ArrayList;

public class Student  {
	private String studentName;
    private ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    // Many-to-many association — enroll in course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);   // Maintain association on both sides
    }

    public void showEnrolledCourses() {
        System.out.println("\n" + studentName + " is enrolled in:");
        for(Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

}
