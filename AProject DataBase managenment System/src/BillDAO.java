import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BillDAO {

    public void getAllBills() {

        String sql =
                "SELECT p.patientName, b.billId, " +
                        "b.consultationCharge, b.laboratoryCharge, " +
                        "b.medicalCharge, b.totalAmount " +
                        "FROM bill b " +
                        "INNER JOIN patient p ON b.patientId = p.patientId";

        try {

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Bill ID: " + rs.getInt("billId"));
                System.out.println("Patient Name: " + rs.getString("patientName"));
                System.out.println("Consultation Charge: " + rs.getInt("consultationCharge"));
                System.out.println("Laboratory Charge: " + rs.getInt("laboratoryCharge"));
                System.out.println("Medical Charge: " + rs.getInt("medicalCharge"));
                System.out.println("Total Amount: " + rs.getInt("totalAmount"));
                System.out.println("--------------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}