package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInsertData {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/demo_db";
		String mysqlId = "root";
		String pass = "MYSQL333";

		Connection con = DriverManager.getConnection(url, mysqlId, pass);

		String query = "insert into student values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, 11);
		pst.setString(2, "Ghadge");
		pst.setString(3, "dev");
		pst.setFloat(4, 44.5f);

		int rows = pst.executeUpdate();
		System.out.println(rows + " - rows inserted.");
		System.out.println("Thanks.");

	}

}
