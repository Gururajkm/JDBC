package com.Gururaj.Jdbc;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class Jdbc_Select {

		public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");

			Statement smt=con.createStatement();
	        ResultSet rs=smt.executeQuery("select * from emp");
	        while(rs.next())
	        {
	        	int empid=rs.getInt(1);
	        	int salary=rs.getInt(3);
	        	String empname=rs.getString(2);
	        	System.out.println("emp id  "+empid+ "empsal"+salary+"empname"+empname );
	        }
	        
	       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		}
	}


