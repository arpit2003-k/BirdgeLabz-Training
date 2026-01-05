package com.objectmodelling.assistedpoblems.librarymanagment;

import java.util.ArrayList;

public class Library {
	private String libraryName;
    private ArrayList<Book> books;   // Aggregation

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {     // Library uses Book
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        System.out.println("Books in this library:");
        for (Book b : books) {
            b.displayBookDetails();
        }
    }
}
