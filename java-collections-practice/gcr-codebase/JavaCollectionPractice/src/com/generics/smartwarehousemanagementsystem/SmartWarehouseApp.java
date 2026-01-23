package com.generics.smartwarehousemanagementsystem;

public class SmartWarehouseApp {
	
	public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 1200));
        groceryStorage.addItem(new Groceries("Oil", 150));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500));

        System.out.println("---- Electronics ----");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries ----");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\n---- Furniture ----");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }

}
