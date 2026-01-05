package com.objectmodelling.assistedpoblems.librarymanagment;

public class UseLibrary {
	public static void main(String[] args) {

        // Books exist independently
        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book b2 = new Book("Atomic Habits", "James Clear");
        Book b3 = new Book("Clean Code", "Robert Martin");

        // Two libraries
        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        // Same book can be added to multiple libraries (Aggregation)
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2);
        collegeLibrary.addBook(b3);

        // Display books
        cityLibrary.showLibraryBooks();
        collegeLibrary.showLibraryBooks();
    }

}
