import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/Admin";

    private static final String USER = "postgres";

    private static final String PASSWORD = "1313799";

    public static Connection getConnection() {

        try {

            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (Exception e) {

            System.out.println("Connection Error");
            e.printStackTrace();

            return null;
        }
    }
}