package com.nucleus.execution;

import java.io.IOException;
import java.util.Scanner;
//import com.nucleus.fileuploadDAO.CustomerDao;								//importing packages to use the values from those packages

public class ExecutionMain  {
	public static void main(String[] args) throws IOException {
	Execution e=new Execution();	
	Scanner kb=new Scanner(System.in);
    System.out.println("Enter the file path");								//user input
	String path=kb.nextLine();	
	int n=1;
	String l=null;
	do{
	System.out.println("Enter the name of the file to be uploaded ");			//user input
	String fname=kb.nextLine();	
	if(fname.endsWith(".txt"))
	{
         l=fname;																//if file name is entered with txt then this will execute else n=2 is the second attempt
          n=2;
	}
	else
	{
		System.out.println("enter file with .txt extension");					//if file name is without txt format	
		
	}}while(n==1);		
	System.out.println("Enter the rejection level");							//user input for rejection level
	System.out.println(" R - if Record Level rejection is followed.");
       System.out.println("F – if File level rejection is followed");
       char choice=kb.next().charAt(0);	
       switch(choice)
       {
       case 'R':  e. readFromFile("location","choice");
       break;
    	   
       case 'F':   e.readFromFile("location", "choice");

       }
       kb.close();
}
	}