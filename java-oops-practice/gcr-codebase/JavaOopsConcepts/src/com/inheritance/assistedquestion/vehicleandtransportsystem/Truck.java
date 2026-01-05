package com.inheritance.assistedquestion.vehicleandtransportsystem;

public class Truck extends Vehicle {

    int loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
