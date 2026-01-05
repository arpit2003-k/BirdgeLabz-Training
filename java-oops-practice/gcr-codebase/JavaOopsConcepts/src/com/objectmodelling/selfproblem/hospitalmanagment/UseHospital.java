package com.objectmodelling.selfproblem.hospitalmanagment;
import java.util.*;
public class UseHospital {
	public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Amit");
        Doctor d2 = new Doctor("Neha");

        Patient p1 = new Patient("Rohan");
        Patient p2 = new Patient("Priya");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        // Consultations (communication happening here)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Show relationships
        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
