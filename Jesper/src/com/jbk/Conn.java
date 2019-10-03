package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	private static Connection con=null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc://localhost:3306/student","root","root");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection getCon() {
		return con;
		
	}
}
