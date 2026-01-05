/*Real-world, Story-driven Java programming problems—each detailed like a
mini-scenario or use-case story, and each integrating Classes, Variables & Methods,
Constructors, Access Modifiers, Interfaces, Operators, and OOP Principles
(Encapsulation, Inheritance, Abstraction, Polymorphism).
1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.*/


interface Payable {
    double calculatePayment();
}


class Patient {

    public int patientId;                 // Public
    protected String name;                // Protected
    private String medicalHistory;        // Private (Encapsulation)
    private double consultationFee;

    private boolean emergency;

    // Normal Patient Constructor
    public Patient(int patientId, String name, double consultationFee) {
        this.patientId = patientId;
        this.name = name;
        this.consultationFee = consultationFee;
        this.emergency = false;
    }

    // Overloaded Constructor — Emergency Patient
    public Patient(int patientId, String name, double consultationFee, boolean emergency) {
        this(patientId, name, consultationFee);
        this.emergency = emergency;

        // Emergency fee added — operators used here
        if (emergency) {
            this.consultationFee += 1000;
        }
    }

    public boolean isEmergency() {
        return emergency;
    }

    // Private data accessed via setters/getters — Encapsulation
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient: " + name + 
               " | Emergency: " + (emergency ? "YES" : "NO");
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    // Polymorphic method
    public String displayInfo() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
}


class Doctor {

    public int doctorId;
    protected String name;
    protected String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String displayInfo() {
        return "Doctor: " + name + " | Specialization: " + specialization;
    }
}


class InPatient extends Patient {

    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(int id, String name, double fee,
                     int daysAdmitted, double roomChargePerDay, boolean emergency) {

        super(id, name, fee, emergency);   // Calling parent constructor
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
                " | Type: InPatient | Days: " + daysAdmitted;
    }

    public double getRoomCharges() {
        return daysAdmitted * roomChargePerDay;
    }
}


class OutPatient extends Patient {

    private String appointmentDate;

    public OutPatient(int id, String name, double fee, String appointmentDate) {
        super(id, name, fee);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
                " | Type: OutPatient | Appointment: " + appointmentDate;
    }
}


class Bill implements Payable {

    private Patient patient;
    private double taxRate = 0.18;    // 18% GST
    private double discount = 0;

    public Bill(Patient patient) {
        this.patient = patient;
    }

    // Example of abstraction + operators
    @Override
    public double calculatePayment() {

        double baseAmount = patient.getConsultationFee();

        if (patient instanceof InPatient) {
            baseAmount += ((InPatient) patient).getRoomCharges();
        }

        // Apply discount if not emergency
        discount = patient.isEmergency() ? 0 : baseAmount * 0.05;

        double tax = baseAmount * taxRate;

        return baseAmount + tax - discount;
    }

    public void printBill() {

        double total = calculatePayment();

        System.out.println("\n------- BILL SUMMARY -------");
        System.out.println(patient.getSummary());
        System.out.println("Total Payable: ₹" + total);
        System.out.println("----------------------------\n");
    }
}


public class HospitalSystem {

    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr. Mehta", "Cardiology");

        // Emergency InPatient
        InPatient p1 = new InPatient(
                1, "Riya", 1500, 3, 4000, true
        );
        p1.setMedicalHistory("Heart Condition");

        // Normal OutPatient
        OutPatient p2 = new OutPatient(
                2, "Arjun", 800, "05-Jan-2026"
        );
        p2.setMedicalHistory("Flu");

        // Polymorphism in action
        System.out.println(d1.displayInfo());
        System.out.println(p1.displayInfo());
        System.out.println(p2.displayInfo());

        // Bills
        Bill bill1 = new Bill(p1);
        bill1.printBill();

        Bill bill2 = new Bill(p2);
        bill2.printBill();
    }
}
