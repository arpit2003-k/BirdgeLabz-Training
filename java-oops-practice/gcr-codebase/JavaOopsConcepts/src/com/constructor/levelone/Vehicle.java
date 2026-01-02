package com.constructor.levelone;

public class Vehicle {
	// Instance Variables (unique per object)
    private String ownerName;
    private String vehicleType;

    // Class Variable (shared by all vehicles)
    private static double registrationFee = 2500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method — prints details
    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("----------------------------------");
    }

    // Class (Static) Method — update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    // Test Program
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Arpit Gupta", "Car");
        Vehicle v2 = new Vehicle("Rohan Sharma", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update fee for ALL vehicles
        Vehicle.updateRegistrationFee(3000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }

}
