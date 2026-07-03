// 4. Appointment Class - Composition

class Appointment {

    private int appointmentId;

    private String appointmentDate;

    private String appointmentTime;

    private boolean status;

    private Patient patient;

    private Doctor doctor;

    public Appointment() {

    }

    public Appointment(int appointmentId, String appointmentDate, String appointmentTime,

                       boolean status, Patient patient, Doctor doctor) {

        this.appointmentId = appointmentId;

        this.appointmentDate = appointmentDate;

        this.appointmentTime = appointmentTime;

        this.status = status;

        this.patient = patient;

        this.doctor = doctor;

    }

    public int getAppointmentId() {

        return appointmentId;

    }

    public void setAppointmentId(int appointmentId) {

        this.appointmentId = appointmentId;

    }

    public String getAppointmentDate() {

        return appointmentDate;

    }

    public void setAppointmentDate(String appointmentDate) {

        this.appointmentDate = appointmentDate;

    }

    public String getAppointmentTime() {

        return appointmentTime;

    }

    public void setAppointmentTime(String appointmentTime) {

        this.appointmentTime = appointmentTime;

    }

    public boolean isStatus() {

        return status;

    }

    public void setStatus(boolean status) {

        this.status = status;

    }

    public Patient getPatient() {

        return patient;

    }

    public Doctor getDoctor() {

        return doctor;

    }

    public void displayAppointmentDetails() {

        System.out.println("Appointment ID: " + appointmentId);

        System.out.println("Appointment Date: " + appointmentDate);

        System.out.println("Appointment Time: " + appointmentTime);

        System.out.println("Status: " + (status ? "Confirmed" : "Pending"));

        System.out.println("Patient Name: " + patient.getName());

        System.out.println("Doctor Name: " + doctor.getName());

        System.out.println("Doctor Specialization: " + doctor.getSpecialization());

    }

}
