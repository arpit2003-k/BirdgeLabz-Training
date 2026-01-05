package com.objectmodelling.selfproblem.EcommercePlatform;
import java.util.*;
public class Order {
	private int orderId;
    private Customer customer;
    private List<Product> productList = new ArrayList<>();

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println(product.getProductName() + " added to Order " + orderId);
    }

    public double getTotalAmount() {
        double total = 0;
        for(Product p : productList) total += p.getPrice();
        return total;
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");

        for(Product p : productList) {
            System.out.println("- " + p.getProductName() + " | ₹" + p.getPrice());
        }

        System.out.println("Total Bill: ₹" + getTotalAmount());
    }
}
