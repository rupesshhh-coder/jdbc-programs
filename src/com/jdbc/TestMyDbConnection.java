package com.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMyDbConnection {

	public static void main(String[] args) {

		System.out.println("Hello JDBC !");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Loaded driver of mysql...");

		String url = "jdbc:mysql://localhost:3306/demo_db";
		String mysqlId = "root";
		String pass = "MYSQL333";
		try {
			DriverManager.getConnection(url, mysqlId, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Done.");

		System.out.println("Thanks.");
	}
}
