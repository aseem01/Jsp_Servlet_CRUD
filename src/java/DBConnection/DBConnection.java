package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn = null;

    public Connection DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "");
        } catch (ClassNotFoundException | SQLException e) {

        }
        return conn;
    }
    
    
   
}
