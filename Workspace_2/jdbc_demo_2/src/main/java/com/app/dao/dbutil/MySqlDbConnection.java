package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDbConnection {
	private MySqlDbConnection() {
		
	}
	private static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
	
		String url="jdbc:mysql://localhost:3306/sports";
		String username="root";
		String password="Santanu@1997";
		connection=DriverManager.getConnection(url, username, password);//Driver manager is a class 
		return connection;
		
	}
    
}
