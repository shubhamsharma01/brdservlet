package com.nucleus.execution;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nucleus.fileuploadDAO.CustomerDao;			//importing packages to use the values from those packages 
import com.nucleus.fileuploadDAO.CustomerDaoI;
import com.nucleus.connection.ConnectionSetup;
import com.nucleus.domain.CustomerInfo;
import com.nucleus.errorlog.ErrorLog;
import com.nucleus.validation.Validation;

public class Execution  {
	int num=0;
	public void readFromFile( String l ,String choice)			//method to read data from the testCase file
	{  
		FileReader filereader;
	   Execution e1=new Execution();
	   ErrorLog elog=new ErrorLog();
	    String line=null;
	    CustomerDao customerdao=new CustomerDao();
	    try
		{ System.out.println("******abc");
		 filereader= new FileReader(l);		 
			BufferedReader bufferedreader=new BufferedReader(filereader);
			 line=bufferedreader.readLine();                     
//            System.out.println(line);
                           while(line!=null)
                        { 
                    String[] information= line.split("~",-1);				//to split the string where ~ sign is occurring
                    CustomerInfo c=new CustomerInfo();
                    c.setCustomerCode(information[0]);                  	//to store the value from the string at particular index in the table
                    c.setCustomerName(information[1]);
                    c.setCustomerAddress1(information[2]);
                    c.setCustomerAddress2(information[3]);
                    c.setPin(Integer.parseInt(information[4]));
                    c.setMailId(information[5]);
                    c.setContactNumber(Long.parseLong(information[6]));
                    c.setContactPerson(information[7]);
                    c.setRecordStatus(information[8]);
                    c.setFlag(information[9]);
                    c.setDate(information[10]);
                    c.setCreatedBy(information[11]);
                    c.setModifiedDate(information[12]);
                    c.setModifiedBy(information[13]);                    
                    c.setAuthorizedDate(information[14]);
                    c.setAuthorizedBy(information[15]);
                    Validation v=new Validation();
                         
   
if(choice=="R")															//check the input from user for R/F
{if(v.checkCode(c.getCustomerCode())&&v.checkName(c.getCustomerName())&&v.checkPinCode(c.getPin())&&v.checkEmailFormat(c.getMailId())&&v.checkRecordStatus(c.getRecordStatus())&&v.checkFlag(c.getFlag())&&v.checkContact(c.getContactNumber()))	
 { System.out.println("****");
	customerdao.insertRecord(c);
	line=bufferedreader.readLine();	
 }
 else
 {
	 elog.saveToFile(line);
	 line=bufferedreader.readLine();
 }
}
if(choice=="F")															//check the input from user for R/F
{if(v.checkCode(c.getCustomerCode())&&v.checkName(c.getCustomerName())&&v.checkPinCode(c.getPin())&&v.checkEmailFormat(c.getMailId())&&v.checkRecordStatus(c.getRecordStatus())&&v.checkFlag(c.getFlag())&&v.checkContact(c.getContactNumber()))	
	 {customerdao.insertRecord(c);
		 elog.saveToFile(line);
		 line=bufferedreader.readLine();	
	 }	 
	 else
	 {break;}	
}
	}
                           bufferedreader.close();           		   	
}catch(Exception e)
{elog.saveToFile(line);}
	}
}                	