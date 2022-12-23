package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleOperation {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(System.in);
			bos = new BufferedOutputStream(System.out);
			
			int x = 0;
			while((x=bis.read()) != -1) {
				bos.write(x);
				bos.flush();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bis.close();
				bos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
