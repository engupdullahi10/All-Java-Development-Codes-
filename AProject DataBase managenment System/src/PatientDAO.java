import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    public void getAllPatients() {

        String sql = "SELECT * FROM patient";

        try {

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Patient ID: " + rs.getString("patientId"));
                System.out.println("Patient Name: " + rs.getString("patientName"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("Phone Number: " + rs.getString("phoneNumber"));
                System.out.println("Blood Group: " + rs.getString("bloodGroup"));
                System.out.println("Disease: " + rs.getString("disease"));
                System.out.println("Medical History: " + rs.getString("medicalHistory"));
                System.out.println("Admission Date: " + rs.getDate("admissionDate"));
                System.out.println("--------------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}