package com.nucleus.validation;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Validation
{
	public boolean checkNull(String line)
	{ 
			if(line.isEmpty())
			{return true;}
			return  false;	
	}
	public boolean checkCode(String s)
	{if(s.isEmpty()||s.length()>10)
		return false;
		return true;
	}
	public boolean checkName(String s)
	{if(s.isEmpty())
		return false;
	else if(s.matches("[A-Za-z 0-9]+")&& s.length()<=30)
		return true;
	else
		return false;
	}
	public boolean checkPinCode(int pin)
	{ String str= Integer.toString(pin);
			if(str.isEmpty()) {}
			int j=str.length();
			if(j==6)
			{	return true;}
			else 
			{	return false;}
		}		
	public boolean checkContact(long i)
	{
		int j = String.valueOf(i).length();
		if(j==10)
		return true;
		else
		return false;
	}	
	 public boolean	checkEmailFormat(String email)
	{
	    if(email.contains("@"))
	    {return true;}
	return false;
	}
	public  boolean checkRecordStatus(String s)
		{	if(s.isEmpty())
			{return false;}
			String str1=s.toUpperCase();
			if(str1.charAt(0)=='N'||str1.charAt(0)=='M'||str1.charAt(0)=='A'||str1.charAt(0)=='D'||str1.charAt(0)=='R')
			{return true;}
			return false;
		}
       public	boolean checkFlag(String flag)
		{	if(flag.isEmpty())
			{return false;}
			String flag1=flag.toUpperCase();
			if(flag1.charAt(0)=='A'||flag1.charAt(0)=='I')
			return true;
			return false;
		}
    public boolean fileFormat(String fileName)
	{return fileName.endsWith(".txt");}
}