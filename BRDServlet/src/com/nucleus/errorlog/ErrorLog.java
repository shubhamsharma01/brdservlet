package com.nucleus.errorlog;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
public class ErrorLog {						//class to store all the array[i] with error in any field
			public void saveToFile(String line)
			{
				FileWriter filewriter;
				try {
					filewriter = new FileWriter("errorgf.txt",true);
					//PrintWriter printwriter=new PrintWriter(filewriter);
					filewriter.write(line+"\n");
					filewriter.flush();
				}
				catch (IOException e) {
					e.printStackTrace();
				}	
			}
		}