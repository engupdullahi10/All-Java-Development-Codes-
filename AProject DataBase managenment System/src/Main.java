public class Main {

    public static void main(String[] args) {

        PatientDAO patientDAO = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        BillDAO billDAO = new BillDAO();

        System.out.println("========== Patients ==========");
        patientDAO.getAllPatients();

        System.out.println("\n========== Doctors ==========");
        doctorDAO.getAllDoctors();

        System.out.println("\n========== Appointments ==========");
        appointmentDAO.getAllAppointments();

        System.out.println("\n========== Bills ==========");
        billDAO.getAllBills();
    }
}