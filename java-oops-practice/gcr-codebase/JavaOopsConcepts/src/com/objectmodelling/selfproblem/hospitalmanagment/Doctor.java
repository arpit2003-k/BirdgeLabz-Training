package com.objectmodelling.selfproblem.hospitalmanagment;
import java.util.*;
public class Doctor {
	 private String name;
	    private List<Patient> patients = new ArrayList<>();

	    public Doctor(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    // Associate patient with doctor
	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    // Communication method
	    public void consult(Patient patient) {
	        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());

	        // Record association both ways
	        addPatient(patient);
	        patient.addDoctor(this);
	    }

	    public void showPatients() {
	        System.out.println("\nDr. " + name + " has consulted:");
	        for (Patient p : patients) {
	            System.out.println("- " + p.getName());
	        }
	    }
}
