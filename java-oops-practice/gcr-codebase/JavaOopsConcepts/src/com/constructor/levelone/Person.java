package com.constructor.levelone;

public class Person {
 
	private String name;
	private int age;
	
	//parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// copy constructor 
	public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
	}
	
	public void getPerson() {
		System.out.println("The Name of the person is: "+name);
		System.out.println("The age of the person is: "+age);
	}

    

	
	
}
