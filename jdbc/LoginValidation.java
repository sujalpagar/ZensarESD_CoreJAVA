package com.jdbc;
import java.sql.Statement;
import java.util.Properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginValidation {
	Connection con;
	Statement stm;
	ResultSet rs;
	PreparedStatement ps;
	
	public LoginValidation() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".//Resourses//uservalidation.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String driverClass = p.getProperty("Driver");
			String url = p.getProperty("Url");
			String userName = p.getProperty("UserName");
			String password = p.getProperty("Password");
			
			Class.forName(driverClass);
			con = DriverManager.getConnection(url,userName,password);
			stm = con.createStatement();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void validation(String uname, String pass) {
		try {
			String sql = "select username from info where password = ? ";
			ps=con.prepareStatement(sql);
			ps.setString(1, pass);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				String un=rs.getString(1);
				if(un.equals(uname))
				{
					System.out.println("Welcome");
				}
			}
			else
			{
				System.out.println("Invalid Password for Username");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		LoginValidation lv = new LoginValidation();
		lv.validation("abc","abc123");
	}
	
}
