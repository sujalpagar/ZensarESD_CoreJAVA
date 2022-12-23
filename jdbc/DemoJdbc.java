package com.jdbc;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoJdbc {
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ps;
	static int accNumber;
	
	static Scanner sc = new Scanner(System.in);
	
	public DemoJdbc() {
		
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream(".//Resourses//Dbconfig.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String driverClass = p.getProperty("Driver");
			String url = p.getProperty("Url");
			String userName = p.getProperty("UserName");
			String password = p.getProperty("Password");
			
			Class.forName(driverClass);  //Load Driver
			con = DriverManager.getConnection(url,userName,password);
			stmt = (Statement) con.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void retriveData(int accNum) {
		try {
//			 rs = stmt.executeQuery("select * from accdetails");
			
			ps = con.prepareStatement("select * from accdetails where accNo=?");
			ps.setInt(1, accNum);
			rs= ps.executeQuery();
			
			while(rs.next()) {
				int accNo = rs.getInt(1);
				String accType = rs.getString(2);
				float accBal = rs.getFloat(3);
				
				System.out.println("Account Number : "+accNo+"\nAccount Type : "+accType+"\nAccount Balance : "+accBal);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertRecord(int accNum,String accType,float accBalance) {
		try {
//			int updatecount = stmt.executeUpdate("insert into accdetails values (6,'Saving',8000)");
			
			ps = con.prepareStatement("insert into accdetails values(?,?,?)");
			ps.setInt(1, accNum);
			ps.setString(2, accType);
			ps.setFloat(3, accBalance);
			
			int finl = ps.executeUpdate();
			System.out.println("Data Insert Successfully");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void deleteRecord(int accNum) {
		try {
//			int deleteRec = stmt.executeUpdate("DELETE FROM accdetails WHERE accNo='2'");
			
			ps = con.prepareStatement("DELETE FROM accdetails WHERE accNo=?");
			ps.setInt(1, accNum);
			int finl = ps.executeUpdate();
			System.out.println("Delete Successfully");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		DemoJdbc dj = new DemoJdbc();
		//Account Number
		System.out.print("Enter Account Number : ");
		int accNum = sc.nextInt();
		
		//Account Type
//		System.out.print("Enter Account Type : ");
//		String accType = sc.next();
		
		//Account Balance
//		System.out.print("Enter Account Balance : ");
//		float accBal = sc.nextFloat();
		
		
		
		dj.retriveData(accNum);
//		dj.insertRecord(accNum,accType,accBal);
//		dj.deleteRecord(accNum);
		
		
	}

}
