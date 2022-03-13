package com.mehul.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class MetadataDAO {
	public static void main(String[] args)
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Root@12345");
				Statement stmt = con.createStatement();){
			ResultSet rs = stmt.executeQuery("select * from account");
			ResultSetMetaData resultSetMetaData = (ResultSetMetaData) rs.getMetaData();
			int columnCount = resultSetMetaData.getColumnCount();
			
			for(int i=1; i<=columnCount; i++) {
				System.out.println(resultSetMetaData.getColumnName(i));
				System.out.println(resultSetMetaData.getColumnTypeName(i));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
