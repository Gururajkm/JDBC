package com.Gururaj.Jdbc;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	public class Jdbc_Insert {

		public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br=new BufferedReader( new InputStreamReader (System.in));
			while(true)
				
			{
				System.out.println("enter empid:");
				int eid=Integer.parseInt(br.readLine());
				System.out.println("entereempname :");
				String ename=br.readLine();
				System.out.println("enter  empsal:");
				int esal=Integer.parseInt(br.readLine());
				
				int empid = 0;
				psmt.setInt(1, empid);
				int empsal = 0;
				psmt.setInt(2, empsal);
				String empname = null;
				psmt.setString(3, empname);
				
				int count=psmt.executeUpdate();
				if(count>0)
				{
					System.out.println(count+ "rocord inserted");
				}else {
					System.out.println(count+ "rocord  not inserted");
					System.out.println (" do u want to add rocord  [ yes/no]");
					String ch=br.readLine();
					if(ch.equalsIgnoreCase("no"));
					break;
					
				}
				
				
			}
			
			
			
		}

	}


