package com.constructor.levelone;


public class Course {
	
	private String courseName;
	private int duration;
	private double fee;
	
	private static String instituteName;
	
	
	public static String getInstituteName() {
		return instituteName;
	}

	public static void setInstituteName(String instituteName) {
		Course.instituteName = instituteName;
	}
	public static void modifyInstituteName(String instituteName) {
		Course.instituteName = instituteName;
	}
	public void displayCourseDetail() {
		System.out.println("The Cousre         :"+courseName);
		System.out.println("The duration       :"+duration);
		System.out.println("The fee            :"+fee);
		System.out.println("The Institute Name :"+instituteName);
		System.out.println("---------------------------------------");
	}




	public Course(String courseName,int duration,double fee ) {
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
		
	}
	public static void main(String[] args) {
		Course.setInstituteName("Sharma computer Academy");
		Course c1=new Course("Introduction to java       ",6,5000.0);
		c1.displayCourseDetail();
		
		Course c2=new Course("Introduction to C          ",4,3000.0);
		Course.modifyInstituteName("Coding Thinker");
		c2.displayCourseDetail();
		Course c3=new Course("Introduction to C++        ",5,4000.0);
		Course.modifyInstituteName("BridgeLabz");
		c3.displayCourseDetail();
		
		Course c4=new Course("Introduction to Python     ",8,8000.0);
		Course.modifyInstituteName("Qspider");
		c4.displayCourseDetail();
		
		Course c5=new Course("Introduction to Javascript ",6,9000.0);
		Course.modifyInstituteName("Cybrom Technology");
		c5.displayCourseDetail();
	}
	

}
