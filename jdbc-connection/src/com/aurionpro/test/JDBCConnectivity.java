package com.aurionpro.test;

import java.sql.*;

public class JDBCConnectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","ritz");
//				String query = "create table employees(empId int primary key, empName varchar(25) not null, age int not null, gender varchar(1))";
//				
				Statement stmt = con.createStatement();
//				stmt.executeUpdate(query);
				
//				String insert = "insert into employees values(1,'ritz',21,'M'),(2,'jtipt',22,'M')";
//				stmt.executeUpdate(insert);
		
//				String insert = "insert into employees values(3,'zitr',23,'F'),(4,'tpitj',20,'F')";
//				stmt.executeUpdate(insert);
				
//				String insert = "insert into employees values(5,'kat',24,'F'),(6,'tak',25,'M')";
//				Statement pstmt = con.prepareStatement(insert);	
//				stmt.executeUpdate(insert);
				
//				PreparedStatement pstmt = con.prepareStatement("insert into employees values(?,?,?,?)");
//				pstmt.setInt(1, 7);
//				pstmt.setString(2, "aaa");
//				pstmt.setInt(3, 42);
//				pstmt.setString(4, "F");
//				pstmt.execute();
//				String q = "update employees set age=30 where empId=1";
//				stmt.executeUpdate(q);
				
				String delete = "delete from employees where empId=4";
				stmt.executeUpdate(delete);
				
				
				ResultSet rs = stmt.executeQuery("select * from employees");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
