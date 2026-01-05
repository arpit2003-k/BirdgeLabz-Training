package com.objectmodelling.selfproblem.UniversityManagementSystem;
import java.util.*;
public class Course {
	private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.courseName = name; }

    public void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println(prof.getName() + " is assigned to teach " + courseName);
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Students Enrolled:");

        for(Student s : students)
            System.out.println("- " + s.getName());
    }

	public String getCourseName() {
		// TODO Auto-generated method stub
		return courseName;
	}
}
