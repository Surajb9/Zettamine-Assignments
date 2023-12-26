package com.zettamine.rra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBHandler {
	
	public static Connection establishConnection() {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String dc = rb.getString("driveclass");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");
		
		Connection con = null;
		try {
			Class.forName(dc);
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
