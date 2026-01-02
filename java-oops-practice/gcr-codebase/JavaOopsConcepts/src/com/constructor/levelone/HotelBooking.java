package com.constructor.levelone;

public class HotelBooking {
	
	private String guestName;
    private String roomType;
    private int nights;

    // ️Default Constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //️⃣ Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name  " + guestName);
        System.out.println("Room Type   " + roomType);
        System.out.println("Nights      " + nights);
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {

        // Using default constructor
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();

        // Using parameterized constructor
        HotelBooking b2 = new HotelBooking("Arpit Gupta", "Deluxe", 3);
        b2.displayBooking();

        // Using copy constructor
        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();
    }

}
