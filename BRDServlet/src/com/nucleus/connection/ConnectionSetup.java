package com.nucleus.connection;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionSetup 
{
	Connection con;
	public  Connection getConnection()
	{
		
		try {
	Class.forName("oracle.jdbc.driver.OracleDriver");				//connection with oracle 
	con=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");			//connection with type4 jdbc driver
		
	}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	
	}

	public void closeConnection()
	{
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	

}
