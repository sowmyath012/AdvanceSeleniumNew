package databaseJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFromDB {



	public static void main(String[] args) throws Throwable  {
	Driver driverRef=new Driver();
DriverManager.registerDriver(driverRef);
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "root");
Statement stat = connection.createStatement();
String query = "select * from employee_info";
  ResultSet result = stat.executeQuery(query);
  while(result.next())
  {
	  System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
  }
  connection.close();
	}

}
