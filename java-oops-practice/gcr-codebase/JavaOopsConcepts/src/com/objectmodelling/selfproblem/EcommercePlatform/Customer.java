package com.objectmodelling.selfproblem.EcommercePlatform;

public class Customer {
	private String name;

    public Customer(String name) { this.name = name; }
    public String getName() { return name; }

    // Communication method
    public Order placeOrder(int orderId) {
        System.out.println("\n" + name + " placed Order #" + orderId);
        return new Order(orderId, this);
    }
}
