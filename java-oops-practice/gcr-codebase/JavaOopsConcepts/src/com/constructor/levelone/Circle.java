package com.constructor.levelone;

public class Circle {
	
	private double radius;
	
	// Default constructor
    public Circle() {
        this(1.0);   // calls the parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }
	

}
