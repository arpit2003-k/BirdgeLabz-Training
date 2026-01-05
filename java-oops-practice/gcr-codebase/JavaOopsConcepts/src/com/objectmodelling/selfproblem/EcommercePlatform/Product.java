package com.objectmodelling.selfproblem.EcommercePlatform;

public class Product {
	private String productName;
    private double price;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public double getPrice() { return price; }
}
