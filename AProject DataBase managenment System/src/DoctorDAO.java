import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDAO {

    public void getAllDoctors() {

        String sql = "SELECT * FROM doctor";

        try {

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Doctor ID: " + rs.getString("doctorId"));
                System.out.println("Doctor Name: " + rs.getString("doctorName"));
                System.out.println("Specialization: " + rs.getString("specialization"));
                System.out.println("Qualification: " + rs.getString("qualification"));
                System.out.println("Experience: " + rs.getString("experience"));
                System.out.println("Consultation Fee: " + rs.getInt("consultationFee"));
                System.out.println("--------------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}