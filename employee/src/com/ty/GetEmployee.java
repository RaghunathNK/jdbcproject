package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmployee {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet =statement.executeQuery("select * from Employee");

		while(resultSet.next()) {
			if(resultSet.getInt(1)==1001) {
			System.out.println("id is :"+resultSet.getInt(1));
			System.out.println("name is :"+resultSet.getString(2));
			System.out.println("age is :"+resultSet.getInt(3));
			System.out.println("gender is :"+resultSet.getString(4));
			}
		}
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
