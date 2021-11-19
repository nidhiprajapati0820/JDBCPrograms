package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "nidhi";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection establishes");

	}

}
