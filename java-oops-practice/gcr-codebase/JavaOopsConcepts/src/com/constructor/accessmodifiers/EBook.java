package com.constructor.accessmodifiers;

public class EBook extends Book{
	private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void showEBookInfo() {
        System.out.println("E-Book Title: " + title);  // accessing protected member
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Author: " + getAuthor());   // must use getter
    }
}
