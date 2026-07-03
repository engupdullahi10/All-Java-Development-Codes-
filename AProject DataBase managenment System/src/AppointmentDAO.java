import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AppointmentDAO {

    public void getAllAppointments() {

        String sql =
                "SELECT p.patientName, d.doctorName, d.specialization, " +
                        "a.appointmentDate, a.appointmentTime " +
                        "FROM appointment a " +
                        "INNER JOIN patient p ON a.patientId = p.patientId " +
                        "INNER JOIN doctor d ON a.doctorId = d.doctorId";

        try {

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Patient Name: " + rs.getString("patientName"));
                System.out.println("Doctor Name: " + rs.getString("doctorName"));
                System.out.println("Specialization: " + rs.getString("specialization"));
                System.out.println("Appointment Date: " + rs.getDate("appointmentDate"));
                System.out.println("Appointment Time: " + rs.getString("appointmentTime"));
                System.out.println("--------------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}