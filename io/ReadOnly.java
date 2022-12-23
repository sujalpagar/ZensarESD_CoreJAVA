package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadOnly {
	public static void main(String args[]) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".//Resourses//data.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String id =p.getProperty("user_id");
			String pass = p.getProperty("password");
			
			if(id.equals("dypdata") && pass.equals("dypatil")) {
				System.out.println("Welcome");
			}else {
				System.out.println("Invalid Id Or Password.");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
