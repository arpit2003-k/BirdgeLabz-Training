package com.regex;

public class LicensePlateValidator {
    public static void main(String[] args) {
        String plate = "AB1244";

        // Two uppercase letters + four digits
        String regex = "^[A-Z]{2}\\d{4}$";

        System.out.println(plate.matches(regex));
    }
}