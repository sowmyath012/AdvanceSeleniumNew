package databaseJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDB {

	public static void main(String[] args) throws Throwable {
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "root");
		Statement stat = connection.createStatement();
		String query = "insert into employee_info(first_name,address)values('Allen' ,'Goa')";
		int result = stat.executeUpdate(query);
		if(result==1)
		{
			System.out.println("Data is updated");
		}
		else
		{
			System.out.println("Data is not updated");
		}

	}

}
