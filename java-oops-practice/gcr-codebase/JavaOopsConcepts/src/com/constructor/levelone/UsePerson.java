package com.constructor.levelone;

public class UsePerson {

	public static void main(String[] args) {
		
		Person p1=new Person("Arpit Gupta",21);
		Person p2=new Person(p1);
		
		p1.getPerson();
		p2.getPerson();

	}

}
