package com.inheritance.singleinheritance.libraryManagement;

public class Author extends Book {

	 String name;
	 String bio;

	 // Constructor
	 Author(String title, int publicationYear, String name, String bio) {
	     super(title, publicationYear);
	     this.name = name;
	     this.bio = bio;
	 }

	 // Overriding displayInfo method
	 @Override
	 void displayInfo() {
	     super.displayInfo();
	     System.out.println("Author Name      : " + name);
	     System.out.println("Author Bio       : " + bio);
	 }
	}