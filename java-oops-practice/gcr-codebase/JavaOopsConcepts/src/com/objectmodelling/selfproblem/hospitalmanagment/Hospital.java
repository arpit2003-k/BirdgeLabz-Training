package com.objectmodelling.selfproblem.hospitalmanagment;
import java.util.*;
public class Hospital {
	private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("\nHospital: " + name);

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
