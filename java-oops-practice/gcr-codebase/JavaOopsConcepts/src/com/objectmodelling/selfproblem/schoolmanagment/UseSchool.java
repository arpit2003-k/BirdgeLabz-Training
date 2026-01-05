package com.objectmodelling.selfproblem.schoolmanagment;

public class UseSchool {
	public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Rohan");
        Student s2 = new Student("Priya");

        school.addStudent(s1);   // aggregation
        school.addStudent(s2);

        Course maths = new Course("Mathematics");
        Course science = new Course("Science");

        s1.enrollInCourse(maths);
        s1.enrollInCourse(science);

        s2.enrollInCourse(science);

        school.showStudents();

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        maths.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
