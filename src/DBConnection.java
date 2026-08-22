import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url =
            "jdbc:mysql://localhost:3306/inventory_db";

    static String username = "root";

    static String password = "11102005@Bogi";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    url,
                    username,
                    password
            );

        } catch (Exception e) {

            System.out.println("Database connection failed");

            e.printStackTrace();

            return null;
        }
    }
}