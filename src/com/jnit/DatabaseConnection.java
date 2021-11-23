package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;



public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "nidhi";
		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null)
			System.out.println("Connection establishes");
        Statement st =  connection.createStatement(); // Instance factory method
        int x=st.executeUpdate("delete from product where id=506");
        //int x=st.executeUpdate("update product set name='Blossom', category='flower',price=5 where id=504");
         //int x=st.executeUpdate("insert into product values(108,'Lily','flower','$','30',3,'yes')");
	if (x!=0)
		System.out.println("Record deleted");
	
	}

}
