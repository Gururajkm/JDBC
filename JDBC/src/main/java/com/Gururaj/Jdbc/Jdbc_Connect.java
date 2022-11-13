package com.Gururaj.Jdbc;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	public class Jdbc_Connect {
		public static void main(String[] args) {

			try {

				Class.forName("com.mysql.cj.jdbc.Driver"); 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");

				Statement smt=con.createStatement();

				con.prepareStatement("create table emp( empid int,empsal int,empname varchar(20))");

				System.out.print("Table Created Successfully...");
				con.close();

				}

				catch (Exception e) {

				System.out.print(e);

				}

		}

	}


