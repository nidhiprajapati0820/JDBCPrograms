package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "nidhi";
		Connection connection = DriverManager.getConnection(url,username,password);
		if(connection!=null) 
	     System.out.println("Connection Establish");
		PreparedStatement ps = connection.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
		ps.setInt(1, 109);
		ps.setString(2, "Flora");
		ps.setString(3, "flower");
		ps.setString(4, "$");
		ps.setString(5, "40");
		ps.setInt(6, 50);
		ps.setString(7, "no");
		
		int x = ps.executeUpdate();
		if(x!=0)
			System.out.println("Recored inserted");
		

	}

}
