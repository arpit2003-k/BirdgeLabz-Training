package com.constructor.levelone;

public class BookBorrow {
	private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public BookBorrow(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;  // mark book as borrowed
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry! The book '" + title + "' is already borrowed.");
        }
    }
    
       

    // Method to display details
    public void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println("--------------------------------");
    }

    // Test Program
    public static void main(String[] args) {

    	BookBorrow b1 = new BookBorrow("Java Programming", "James Gosling", 499.0, true);

        b1.displayDetails();

        b1.borrowBook();   // First borrow → success
        b1.borrowBook();   // Second borrow → fails

        b1.displayDetails();
    }

}
