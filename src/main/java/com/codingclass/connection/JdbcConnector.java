package com.codingclass.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnector {

	private static Connection con;
	
	public static Connection getConnection() throws SQLException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url="jdbc:mysql://localhost:3306/codingclass";
		     String username="root";
		     String pass="1234";
			
		     con=DriverManager.getConnection(url, username, pass);
			
			return con;
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
}
