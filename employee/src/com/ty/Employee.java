package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) {	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into Employee values(1005,'raghu',22,'male')");
			connection.close();
			System.out.println("data saved");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
