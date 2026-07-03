import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/Hospital Management System";

    private static final String USER = "postgres";
    private static final String PASSWORD = "1313799";

    public static Connection getConnection() {

        try {

            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully.");

            return connection;

        } catch (SQLException e) {

            System.out.println("Connection Failed.");
            e.printStackTrace();

            return null;
        }
    }
}