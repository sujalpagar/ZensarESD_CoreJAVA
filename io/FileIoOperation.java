package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoOperation {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(".//Resourses//Data.txt");
			fos = new FileOutputStream(".//Resourses//backup.txt");
			
			int x = 0;
			while((x=fis.read()) !=0) {
				fos.write(x);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
