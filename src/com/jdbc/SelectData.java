package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/demo_db";
		String mysqlId = "root";
		String pass = "MYSQL333";

		Connection con = DriverManager.getConnection(url, mysqlId, pass);

		String query = "select * from student";

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

//		boolean isNext = rs.next();
//		System.out.println("isNext - " + isNext);

		while (rs.next()) {
			int a = rs.getInt(1);
			String b = rs.getString(2);
			String c = rs.getString(3);
			float d = rs.getFloat(4);
			System.out.println(a + "," + b + "," + c + "," + d);
		}
		System.out.println("\nThanks.");
	}
}
