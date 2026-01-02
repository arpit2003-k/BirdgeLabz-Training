package com.constructor.accessmodifiers;

public class main {
	public static void main(String[] args) {

        EBook ebook = new EBook("978-1234567890", "Java Basics", "John Doe", 2.5);

        ebook.displayDetails();   // from base class
        ebook.showEBookInfo();    // from subclass

        // Update author using setter
        ebook.setAuthor("Robert Martin");

        System.out.println("\nUpdated Author: " + ebook.getAuthor());
    }
}
