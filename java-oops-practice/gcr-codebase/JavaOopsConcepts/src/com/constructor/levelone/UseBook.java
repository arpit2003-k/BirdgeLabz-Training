package com.constructor.levelone;

public class UseBook {

	public static void main(String[] args) {
		
		Book first=new Book();
		
		System.out.println("The Result of Default Constructor");
		first.displayAttribute();
		
		Book second=new Book("The Harry Potter-(Goblet of Fire)","J.K Rowllings",300);
		
		System.out.println("The Result of Parameterized Constructor");
		second.displayAttribute();

	}

}
