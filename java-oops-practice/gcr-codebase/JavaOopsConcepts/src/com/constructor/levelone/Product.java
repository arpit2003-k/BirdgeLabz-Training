package com.constructor.levelone;

public class Product {
	
	private String productName;
	private double price;
	private static int totalProduct;
	
	// Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        // Increase count when a product is created
        totalProduct++;
    }
	
	public void displayProductDetails() {
		System.out.println("The Product Name  :"+productName);
		System.out.println("The Product Price :"+price);
		System.out.println("The Total Product Added :"+totalProduct);
		System.out.println("--------------------------------");
    }
	
	
	public static void displayTotalProducts() {
		System.out.println("The Total Product Added :"+totalProduct);
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		Product p1=new Product("Iphone 16",150000.00);
		p1.displayProductDetails();
		Product p2=new Product("Iphone 15",125000.00);
		p2.displayProductDetails();
		Product p3=new Product("Iphone 14",100000.00);
		p3.displayProductDetails();
		Product p4=new Product("Sumsung S21 Utlra",80000.00);
		p4.displayProductDetails();
		Product p5=new Product("Poco X4 pro 5G",15000.00);
		p5.displayProductDetails();
		
	
		Product.displayTotalProducts();

	}

}
