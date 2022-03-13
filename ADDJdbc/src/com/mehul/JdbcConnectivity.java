package com.mehul;
import java.sql.*;

public class JdbcConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			Connection connection = DriverManager.getConnection(url, "root", "Root@12345");
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into account values(100, 'Mehul', 'Kumar', 20000)");
			System.out.println("rows affected");
		}catch (Exception e)
		{
			e.printStackTrace();
		}		
	}

}

