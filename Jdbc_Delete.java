package com.Gururaj.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc_Delete {
	
	 static void main(String[] args) {
			delete();
			
	     }
		
		public static void delete() {
			// load driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection
				String url="jdbc:mysql://localhost:3306/emp";
			    String username="root";
				String password="root";
			Connection connection	= DriverManager.getConnection(url,username,password);
				
			//create statement
			    Statement statement=connection.createStatement();
			    
		   //execute Query
			    statement.execute("delete from persons where id= 2");
			    
		  //close connection
			    
			    connection.close();
			  
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		}
	}


