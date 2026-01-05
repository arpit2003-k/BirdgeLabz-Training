package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class Order {
	int orderId;
	 String orderDate;

	 // Constructor
	 Order(int orderId, String orderDate) {
	     this.orderId = orderId;
	     this.orderDate = orderDate;
	 }

	 // Method to get order status
	 String getOrderStatus() {
	     return "Order Placed";
	 }
}
