package com.objectmodelling.selfproblem.hospitalmanagment;
import java.util.*;
public class Patient {
	private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Associate doctor with patient
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("\nPatient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}
