package com.objectmodelling.selfproblem.EcommercePlatform;

public class EcommerceMain {
	public static void main(String[] args) {

        Customer c1 = new Customer("Arpit");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 700);
        Product p3 = new Product("Keyboard", 1200);

        Order order = c1.placeOrder(101);

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        order.showOrderDetails();
    }
}
