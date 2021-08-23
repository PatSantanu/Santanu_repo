package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_1 {

	public static void main(String[] args) {
		Connection connection= null;//Here Connection is a class and it's just an external resource which gives the functionality to open the connection
		
		try {
			//Step_1--Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		//Step_2-- Open the connection
			String url="jdbc:mysql://localhost:3306/sports";
			String username="root";
			String password="Santanu@1997";
			connection=DriverManager.getConnection(url, username, password);//Driver manager is a class 
			System.out.println("Connection Established");
		//Step_3--Create Statement
			Statement statement= connection.createStatement();
			String sql="select id,name,age,gender,city,sportsName,contact from player";
		//Step_4--Execute query
			ResultSet resultSet= statement.executeQuery(sql);//it is creating the instance of the chid object and returning it
			System.out.println("query executed successfully");
		//Step_5--Process Results
		//resultSet is pointing to the results, i.e,
			while(resultSet.next()) {
				System.out.print("id :"+resultSet.getInt("id"));
				System.out.print("name :"+resultSet.getString("name"));
				System.out.print("age :"+resultSet.getInt("age"));
				System.out.print("gender :"+resultSet.getString("gender"));
				System.out.print("city :"+resultSet.getString("city"));
				System.out.print("sportsName :"+resultSet.getString("sportsName"));
				System.out.println("contact :"+resultSet.getLong("contact"));
			}
			System.out.println("reults processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException e){
			System.out.println(e);
		}finally {
			try {
				//Step_6--Close the connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}
}
