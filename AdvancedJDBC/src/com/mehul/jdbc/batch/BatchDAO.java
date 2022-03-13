package com.mehul.jdbc.batch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {
	public static void main(String[] args)
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Root@12345");
				Statement stmt = con.createStatement();)
		{
			stmt.addBatch("insert int account values(1, 'Kamlesh', 'Prasad', 20000");
			stmt.addBatch("insert int account values(2, 'Ashok', 'Gupta', 30000");
			
			int[] result = stmt.executeBatch();
			for(int i=0; i<result.length; i++) 
			{
				System.out.println(result[i]);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
