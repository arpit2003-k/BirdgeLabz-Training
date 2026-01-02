package com.constructor.levelone;

public class Book {
	
	private String title ; 
	private String author ;
	private int price ;
	
	//Default constructor..
	public Book() {
		title = "The Dairy of Anne Frank";
		author = "Anne Frank";
		price = 200;
	}
	// Parameterized Constructor
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayAttribute() {
		System.out.println("The Title of the Book is "+title);
		System.out.println("The Author of the Book is "+author);
		System.out.println("The Price of the Book is "+price);
	}
	
    
	
}

