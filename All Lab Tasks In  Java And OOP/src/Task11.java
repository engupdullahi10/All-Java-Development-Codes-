// Patient Class
class Patient {
    private final int patientId;
    private final String name;
    private int age;
    private String disease;
    public Patient(int patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    public void showPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
    public void updateDisease(String newDisease) {
        this.disease = newDisease;
    }
    public void updateAge(int newAge) {
        this.age = newAge;
    }
}
// Doctor Class
class Doctor {
    private final int doctorId;
    private final String name;
    private String specialization;
    private double salary;
    public Doctor(int doctorId, String name, String specialization, double salary) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }
    public void showDoctorDetails() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
    }
    public void updateSpecialization(String newSpecialization) {
        this.specialization = newSpecialization;
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}
// Room Class
class Room {
    private final int roomNumber;
    private String roomType;
    private boolean availabilityStatus; // true = available, false = occupied
    public Room(int roomNumber, String roomType, boolean availabilityStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.availabilityStatus = availabilityStatus;
    }
    public void showRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Available: " + availabilityStatus);
    }
    public void updateRoomType(String newType) {
        this.roomType = newType;
    }
    public void changeAvailability(boolean status) {
        this.availabilityStatus = status;
    }
}
// Hospital Class
class Hospital {
    private final String hospitalName;
    private String location;
    private String contactNumber;
    public Hospital(String hospitalName, String location, String contactNumber) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
    public void showHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Contact Number: " + contactNumber);
    }
    public void updateContactNumber(String newNumber) {
        this.contactNumber = newNumber;
    }
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
// Main Class
public class Task11 {
    public static void main(String[] args) {
        Patient patient = new Patient(12, "Hafso", 20, "Malaria");
        Doctor doctor = new Doctor(512, "Dr Abdullahi", "Cardiology", 2500.0);
        Room room = new Room(10, "Single", true);
        Hospital hospital = new Hospital("City Hospital", "Lahore", "0322499561");
        // Details
        System.out.println("=== Initial Details ===\n");
        patient.showPatientDetails();
        System.out.println();
        // Doctor
        doctor.showDoctorDetails();
        System.out.println();
        // Room
        room.showRoomDetails();
        System.out.println();

        hospital.showHospitalInfo();

        // Updating values
        patient.updateDisease("Typhoid");
        patient.updateAge(25);
        // Update Doctor Details
        doctor.updateSpecialization("Neurology");
        doctor.updateSalary(3000.0);
        // Room Update Details
        room.updateRoomType("Double");
        room.changeAvailability(false);
        // Hospital Details
        hospital.updateLocation("Johar Town");
        hospital.updateContactNumber("03001234567");
        // Update Details
        System.out.println("\n=== After Updates ===\n");
        // Patients Update
        patient.showPatientDetails();
        System.out.println();
        // Doctor Update
        doctor.showDoctorDetails();
        System.out.println();
        // Room Update
        room.showRoomDetails();
        System.out.println();
        hospital.showHospitalInfo();
    }
}