import java.util.*;
import java.io.*;

abstract class Person {
    private String personId;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;

    public Person(String personId, String name, int age, String gender, String phone, String address) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public void displayDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public abstract void performRole();
}

class Patient extends Person {
    private String bloodGroup;
    private String disease;
    private String medicalHistory;
    private String admissionDate;

    public Patient(String personId, String name, int age, String gender,
                   String phone, String address, String bloodGroup,
                   String disease, String medicalHistory, String admissionDate) {

        super(personId, name, age, gender, phone, address);

        this.bloodGroup = bloodGroup;
        this.disease = disease;
        this.medicalHistory = medicalHistory;
        this.admissionDate = admissionDate;
    }

    public void viewPatientRecord() {
        displayDetails();
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Disease: " + disease);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Admission Date: " + admissionDate);
    }

    @Override
    public void performRole() {
        System.out.println("Patient is receiving treatment.");
    }
}

class Doctor extends Person {
    private String specialization;
    private String qualification;
    private int experience;
    private double consultationFee;

    public Doctor(String personId, String name, int age, String gender,
                  String phone, String address, String specialization,
                  String qualification, int experience, double consultationFee) {

        super(personId, name, age, gender, phone, address);

        this.specialization = specialization;
        this.qualification = qualification;
        this.experience = experience;
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void viewDoctorDetails() {
        displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " Years");
        System.out.println("Consultation Fee: Rs." + consultationFee);
    }

    @Override
    public void performRole() {
        System.out.println("Doctor is treating patients.");
    }
}

class Appointment {
    private String appointmentId;
    private String date;
    private String time;
    private String status;

    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentId, String date, String time,
                       String status, Patient patient, Doctor doctor) {

        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.status = status;
        this.patient = patient;
        this.doctor = doctor;
    }

    public void displayAppointment() {
        System.out.println("\nAppointment ID: " + appointmentId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Status: " + status);
    }
}

interface Payment {
    void processPayment(double amount);
    void generateReceipt(double amount);
}

class CashPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Cash Payment Processed.");
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Receipt Generated.");
        System.out.println("Amount Paid: Rs." + amount);
    }
}

class CardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Card Payment Successful.");
    }

    @Override
    public void generateReceipt(double amount) {
        System.out.println("Digital Receipt Generated.");
        System.out.println("Amount Paid: Rs." + amount);
    }
}

class Bill {
    private String billId;
    private double consultationCharges;
    private double laboratoryCharges;
    private double medicineCharges;

    private Payment payment;

    public Bill(String billId, double consultationCharges,
                double laboratoryCharges, double medicineCharges,
                Payment payment) {

        this.billId = billId;
        this.consultationCharges = consultationCharges;
        this.laboratoryCharges = laboratoryCharges;
        this.medicineCharges = medicineCharges;
        this.payment = payment;
    }

    public double calculateBill() {
        return consultationCharges + laboratoryCharges + medicineCharges;
    }

    public void displayBill() {
        double total = calculateBill();

        System.out.println("\n===== HOSPITAL BILL =====");
        System.out.println("Bill ID: " + billId);
        System.out.println("Consultation Charges: Rs." + consultationCharges);
        System.out.println("Laboratory Charges: Rs." + laboratoryCharges);
        System.out.println("Medicine Charges: Rs." + medicineCharges);
        System.out.println("Total Amount: Rs." + total);

        payment.processPayment(total);
        payment.generateReceipt(total);
    }
}

class FileManager {

    public static void saveData(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(data + "\n");
            writer.close();
            System.out.println("Data Saved Successfully.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    public static void readData(String fileName) {
        try {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File Not Found.");
                return;
            }

            Scanner read = new Scanner(file);

            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }

            read.close();

        } catch (Exception e) {
            System.out.println("Error Reading File.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("=========== MEDICARE MANAGEMENT SYSTEM ===========");

            Patient patient = new Patient(
                    "P101",
                    "Ahmed Ali",
                    22,
                    "Male",
                    "03001234567",
                    "Lahore",
                    "O+",
                    "Fever",
                    "No Previous Record",
                    "23-06-2026"
            );

            Doctor doctor = new Doctor(
                    "D201",
                    "Dr Sarah Khan",
                    35,
                    "Female",
                    "03111234567",
                    "Lahore",
                    "Cardiologist",
                    "MBBS",
                    8,
                    2000
            );

            System.out.println("\nPATIENT DETAILS");
            patient.viewPatientRecord();

            System.out.println("\nDOCTOR DETAILS");
            doctor.viewDoctorDetails();

            Appointment appointment = new Appointment(
                    "A301",
                    "25-06-2026",
                    "10:30 AM",
                    "Scheduled",
                    patient,
                    doctor
            );

            appointment.displayAppointment();

            System.out.println("\nSelect Payment Method");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            System.out.print("Choice: ");

            int choice = input.nextInt();

            Payment payment;

            if (choice == 1) {
                payment = new CashPayment();
            } else {
                payment = new CardPayment();
            }

            Bill bill = new Bill(
                    "B401",
                    doctor.getConsultationFee(),
                    1000,
                    1500,
                    payment
            );

            bill.displayBill();

            FileManager.saveData(
                    "records.txt",
                    "Patient: Ahmed Ali | Doctor: Dr Sarah Khan | Bill Generated"
            );

            System.out.println("\n===== SAVED RECORDS =====");
            FileManager.readData("records.txt");

            System.out.println("\nSystem Executed Successfully.");

        } catch (Exception e) {
            System.out.println("Invalid Input Entered.");
        }

        input.close();
    }
}