package com.constructor.levelone;

public class UseCircle {

	public static void main(String[] args) {
		
		// default radius = 1.0
		Circle c1 = new Circle();  
		// user-provided radius
        Circle c2 = new Circle(5.5);     

        System.out.println("Radius 1: " + c1.getRadius());
        System.out.println("Radius 2: " + c2.getRadius());

	}

}
