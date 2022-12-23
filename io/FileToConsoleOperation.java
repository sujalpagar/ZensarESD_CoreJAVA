package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsoleOperation {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(".//Resourses//Data.txt");
			bos = new BufferedOutputStream(System.out);
			int x = 0;
			while((x=fis.read()) != -1) {
				bos.write(x);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				bos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
