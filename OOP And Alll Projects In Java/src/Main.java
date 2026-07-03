import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Patient Class
class Patient {
    private final String name;
    private final int id;
    private final String disease;
    private final int age;

    public Patient(String name, int id, String disease, int age) {
        this.name = name;
        this.id = id;
        this.disease = disease;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getId() { return id; }
    public String getDisease() {
        return disease;
    }
    public int getAge() {
        return age;
    }

    public void showPatient() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Disease: " + disease);
        System.out.println("Age: " + age);
    }
}

// Doctor Class
class Doctor {
    private final String name;
    private final int id;
    private final String special;
    private final double salary;

    public Doctor(String name, int id, String special, double salary) {
        this.name = name;
        this.id = id;
        this.special = special;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getSpecial() {
        return special;
    }
    public double getSalary() {
        return salary;
    }

    public void showDoctor() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialization: " + special);
        System.out.println("Salary: $" + salary);
    }
}

// Room Class
class Room {
    private final int number;
    private final String type;
    private final boolean status;

    public Room(int number, String type, boolean status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public void showRoom() {
        System.out.println("Room Number: " + number);
        System.out.println("Room Type: " + type);
        System.out.println("Available: " + status);
    }
}

// Hospital Class
class Hospital {
    private final String name;
    private final String location;
    private final int contact;

    public Hospital(String name, String location, int contact) {
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public void showHospital() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Contact: " + contact);
    }
}

// Main System
public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1 Add Patient");
            System.out.println("2 Add Doctor");
            System.out.println("3 Search Patient");
            System.out.println("4 Search Doctor");
            System.out.println("5 Save Data");
            System.out.println("6 Read Patient File");
            System.out.println("7 Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    searchPatient();
                    break;
                case 4:
                    searchDoctor();
                    break;
                case 5:
                    savePatients();
                    saveDoctors();
                    break;
                case 6:
                    readPatientFile();
                    break;

                case 7:
                    System.out.println("Program closed.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Add Patient
    public static void addPatient() {
        System.out.print("Patient Name: ");
        String name = input.nextLine();
        System.out.print("Patient ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Disease: ");
        String disease = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        input.nextLine();
        Patient p = new Patient(name, id, disease, age);
        patients.add(p);
        System.out.println("Patient added successfully.");
    }
    // Add Doctor
    public static void addDoctor() {
        System.out.print("Doctor Name: ");
        String name = input.nextLine();
        System.out.print("Doctor ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Specialization: ");
        String special = input.nextLine();
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        input.nextLine();
        Doctor d = new Doctor(name, id, special, salary);
        doctors.add(d);
        System.out.println("Doctor added successfully.");
    }
    // Search Patient
    public static void searchPatient() {
        System.out.print("Enter Patient ID: ");
        int id = input.nextInt();
        for (Patient p : patients) {
            if (p.getId() == id) {
                p.showPatient();
                return;
            }
        }
        System.out.println("Patient not found.");
    }
    // Search Doctor
    public static void searchDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = input.nextInt();
        for (Doctor d : doctors) {
            if (d.getId() == id) {
                d.showDoctor();
                return;
            }
        }
        System.out.println("Doctor not found.");
    }
    // Save Patients
    public static void savePatients() {
        try {
            FileWriter fw = new FileWriter("patients.txt");
            for (Patient p : patients) {
                fw.write(p.getName() + "," +
                        p.getId() + "," +
                        p.getDisease() + "," +
                        p.getAge() + "\n");
            }
            fw.close();
            System.out.println("Patients saved.");
        } catch (Exception e) {
            System.out.println("Error saving patients.");
        }
    }
    // Save Doctors
    public static void saveDoctors() {
        try {
            FileWriter fw = new FileWriter("doctors.txt");
            for (Doctor d : doctors) {
                fw.write(d.getName() + "," +
                        d.getId() + "," +
                        d.getSpecial() + "," +
                        d.getSalary() + "\n");
            }
            fw.close();
            System.out.println("Doctors saved.");
        } catch (Exception e) {
            System.out.println("Error saving doctors.");
        }
    }
    // Read Patient File
    public static void readPatientFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Name: " + data[0]);
                System.out.println("ID: " + data[1]);
                System.out.println("Disease: " + data[2]);
                System.out.println("Age: " + data[3]);
                System.out.println("-----------------");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}