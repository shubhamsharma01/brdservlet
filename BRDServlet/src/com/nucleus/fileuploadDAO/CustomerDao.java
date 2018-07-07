package com.nucleus.fileuploadDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nucleus.connection.ConnectionSetup;
import com.nucleus.domain.CustomerInfo;
public class CustomerDao {
	Connection con1;
public  void insertRecord(CustomerInfo c) throws SQLException	
	{  		try
		{    
			ConnectionSetup connectionSetup=new ConnectionSetup();
			con1=connectionSetup.getConnection();
//		System.out.println(con1);
		PreparedStatement pstmt=con1.prepareStatement("insert into Shubham_Customer_Master values(seqq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); //to insert values into table
		pstmt.setString(1,c.getCustomerCode());				//inseting values at index form arraylist
		pstmt.setString(2,c.getCustomerName());
		pstmt.setString(3,c.getCustomerAddress1());
		pstmt.setString(4, c.getCustomerAddress2());                   
		pstmt.setInt(5,c.getPin());
		pstmt.setString(6,c.getMailId());
		pstmt.setLong(7,c.getContactNumber());
		pstmt.setString(8,c.getContactPerson());
		pstmt.setString(9,c.getRecordStatus());
		pstmt.setString(10,c.getFlag());
		pstmt.setString(11,c.getDate());
		pstmt.setString(12,c.getCreatedBy());
		pstmt.setString(13,c.getModifiedDate());
		pstmt.setString(14,c.getModifiedBy());
		pstmt.setString(15,c.getAuthorizedDate());
		pstmt.setString(16,c.getAuthorizedBy());
		pstmt.executeUpdate();
		System.out.println("saved");	         
		}
		catch(SQLException e)
		{
			System.out.println("Invalid value2");
		}
	}
}