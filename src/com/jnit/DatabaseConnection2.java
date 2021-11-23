package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "nidhi";
		Connection connection = DriverManager.getConnection(url,username,password);
		if(connection!=null) 
	     System.out.println("Connection Establish");
		Statement st = connection.createStatement();
		//ResultSet rs = st.executeQuery("select * from product");
		ResultSet rs = st.executeQuery("select id,name,category from product");
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5)+"  "+ rs.getString(6)+"  "+rs.getString(7));
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			//System.out.println(rs.getInt("id"));
		}
		
		}

}

