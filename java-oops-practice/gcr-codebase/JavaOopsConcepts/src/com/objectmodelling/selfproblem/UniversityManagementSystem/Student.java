package com.objectmodelling.selfproblem.UniversityManagementSystem;
import java.util.*;
public class Student {
	private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) { this.name = name; }
    public String getName() { return name; }

    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
        c.enrollStudent(this);   // communication both ways
    }

    public void showMyCourses() {
        System.out.println("\n" + name + " is enrolled in:");
        for(Course c : enrolledCourses)
            System.out.println("- " + c.getCourseName());
    }
}
