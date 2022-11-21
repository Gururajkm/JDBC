package com.Gururaj.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Jdbc_Create_ {
		
  public static void main(String[] args) {
			select();
		}


	public static void select() {
		//1.load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//2.get connection
			String url="jdbc:mysql://localhost:3306/emp";
			String username="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, username, password);
			
		//3.create statement
		  Statement statement =connection.createStatement();
		
		//4.Execute Query
		
	       ResultSet   rs  = statement.executeQuery("SELECT * FROM persons");
	       while(rs.next()) {
	    	 System.out.println("ID :"+rs.getInt(1)+"  "+ "pName :"+rs.getString(2)+"  "+"pAge :"+rs.getString(3));
	        }
	       
	      //5.connection close 
	       connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
		    e.printStackTrace();
		}
		
	}
	}

