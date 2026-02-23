package com.transactionmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
	


	    private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
	    private static final String USER = "root";
	    private static final String PASSWORD = "admin123";

	    // Get database connection
	    public static Connection getConnection() throws SQLException {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("MySQL Driver not found", e);
	        }
	    }
	

}
