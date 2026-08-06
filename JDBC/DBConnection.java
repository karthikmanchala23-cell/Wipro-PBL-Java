import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class responsible for establishing the JDBC connection.
 * Update the URL / USER / PASSWORD constants to match your database.
 * (Written against Oracle syntax per the SQL used in schema.sql --
 *  swap the driver class / URL if you are using MySQL, etc.)
 */
public class DBConnection {

    // ---- Update these for your environment ----
    private static final String URL      = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER     = "system";
    private static final String PASSWORD = "password";
    private static final String DRIVER   = "oracle.jdbc.driver.OracleDriver";

    /**
     * Obtains and returns a Connection object to the database.
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
}
