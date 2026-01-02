package com.constructor.accessmodifiers;

public class Book {
	public String ISBN;        // Public: accessible everywhere
    protected String title;    // Protected: accessible in subclass + same package
    private String author;     // Private: accessible ONLY inside this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public Getter for author
    public String getAuthor() {
        return author;
    }

    // Public Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
