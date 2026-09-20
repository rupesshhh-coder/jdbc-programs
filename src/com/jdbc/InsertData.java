package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/demo_db";
		String mysqlId = "root";
		String pass = "MYSQL333";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, mysqlId, pass);
			String query = "insert into student values (2,'Raju','BA',35.20)";

			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			System.out.println(rows + " - rows inserted.");
			System.out.println("Thanks.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
