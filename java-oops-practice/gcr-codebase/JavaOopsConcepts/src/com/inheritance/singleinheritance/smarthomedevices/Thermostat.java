package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device {

	 int temperatureSetting; // in Celsius

	 // Constructor
	 Thermostat(String deviceId, boolean status, int temperatureSetting) {
	     super(deviceId, status);
	     this.temperatureSetting = temperatureSetting;
	 }

	 // Overriding displayStatus method
	 @Override
	 void displayStatus() {
	     super.displayStatus();
	     System.out.println("Temperature Setting : " + temperatureSetting + "°C");
	 }
}
