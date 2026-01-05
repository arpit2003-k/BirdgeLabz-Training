package com.inheritance.hybridinheritance.restaurantmanagement;

public class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}