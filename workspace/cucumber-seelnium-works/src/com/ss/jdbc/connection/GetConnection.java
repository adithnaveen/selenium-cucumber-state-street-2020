package com.ss.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

		public PreparedStatement ps, ps1, ps2; 
		public ResultSet rs; 
		
		static Connection connection;
		
		
		public static Connection getMySQLConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost/statestreet", "root", "kanchan@1");
				return connection; 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null; 
		}
}














