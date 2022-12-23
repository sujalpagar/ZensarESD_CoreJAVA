package com.io;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFileOperation {
	public static void main(String args[]) {
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		try {
			bis = new BufferedInputStream(System.in);
			fos = new FileOutputStream(".//Resourses//consoletofile.txt");
			
			int x = 0;
			while((x=bis.read()) != -1) {
				fos.write(x);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				bis.close();
				fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
