package com.mehul.jdbc.tm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionDAO {
	public static void main(String[] args)
	{
		Connection con = null;
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Root@12345");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("update account set balannce= balance-500 where id=2");
			stmt.executeUpdate("update account set balannce= balance+500 where id=1");
			con.commit();
			
		}catch (SQLException e) {
			e.printStackTrace();
			try {
				con.close();
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

}
