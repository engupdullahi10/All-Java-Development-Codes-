import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/mysql_first"; // DB name without spaces
        String user = "postgres";
        String password = "1313799";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected! " + con);
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}