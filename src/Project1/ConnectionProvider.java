package Project1;

import java.sql.*;

/**
 * @author Loving GSaurav
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "ridkagts29"); 
            return con;
        } catch (Exception e) {
            // Handle the exception here (e.g., print a stack trace or display an error message)
            e.printStackTrace(); 
            return null;
        }
    }
}