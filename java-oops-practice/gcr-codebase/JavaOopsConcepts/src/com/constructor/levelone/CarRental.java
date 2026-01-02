package com.constructor.levelone;

public class CarRental {
	
	private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 2500;
                break;
            case "sedan":
                ratePerDay = 1800;
                break;
            case "hatchback":
                ratePerDay = 1200;
                break;
            default:
                ratePerDay = 1000; // base rate
        }

        return ratePerDay * rentalDays;
    }

    // Display details
    public void showDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + calculateTotalCost());
        System.out.println("-------------------------------------");
    }

    // Test Program
    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.showDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Arpit Gupta", "SUV", 5);
        rental2.showDetails();

        CarRental rental3 = new CarRental("Rohan", "Hatchback", 3);
        rental3.showDetails();
    }
}
