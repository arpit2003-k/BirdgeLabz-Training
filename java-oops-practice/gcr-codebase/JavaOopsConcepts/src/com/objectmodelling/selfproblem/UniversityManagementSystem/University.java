package com.objectmodelling.selfproblem.UniversityManagementSystem;
import java.util.*;
public class University {
	private String name;
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public University(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }
    public void addCourse(Course c) { courses.add(c); }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Courses: " + courses.size());
    }
}
