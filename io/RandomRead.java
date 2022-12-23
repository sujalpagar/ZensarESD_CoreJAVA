package com.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomRead {
	public static void main(String args[]) {
		File f = null;
		RandomAccessFile raf;
		try {
			f=new File(".//Resourses//backup.txt");
			raf = new RandomAccessFile(f, "r");
			
			for(long i=raf.length(); i>=0; i++) {
				raf.seek(i);
				System.out.println((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
