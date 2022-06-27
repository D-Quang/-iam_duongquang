package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtils {
	private static final String hostName = "localhost";
    private static final String dbName = "ebookshop?useSSL=false";
    private static final String userName = "root";
    private static final String password = "1234";
    // jdbc:mysql://hostname:port/dbname
    private static final String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
 
    public static Connection openConnection() throws SQLException {
        // 1. Load Driver
        // Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 
        // 2. Open connection
        return DriverManager.getConnection(connectionURL, userName, password);
    }
}

