package com.objectmodelling.selfproblem.UniversityManagementSystem;

public class UniversityMain {
	public static void main(String[] args) {

        University uni = new University("RGPV University");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Patel");

        Course c1 = new Course("DBMS");
        Course c2 = new Course("OOPs");

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        Student s1 = new Student("Arpit");
        Student s2 = new Student("Priya");

        uni.addStudent(s1);
        uni.addStudent(s2);

        uni.addCourse(c1);
        uni.addCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        c1.showCourseDetails();
        c2.showCourseDetails();

        s1.showMyCourses();
        s2.showMyCourses();

        uni.showUniversityDetails();
    }
}
