package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementInsertListData {

	public static void main(String[] args) throws Exception {

		List<Student> studList = new ArrayList<>();
		studList.add(new Student(101, "Raj", "BCS", 20.5f));
		studList.add(new Student(102, "Rani", "BBA", 50.5f));
		studList.add(new Student(103, "Ram", "BCA", 70.5f));

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/demo_db";
		String mysqlId = "root";
		String pass = "MYSQL333";

		Connection con = DriverManager.getConnection(url, mysqlId, pass);

		String query = "insert into student values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);

		for (Student s : studList) {
			pst.setInt(1, s.id);
			pst.setString(2, s.name);
			pst.setString(3, s.course);
			pst.setFloat(4, s.per);
			pst.executeUpdate();
		}

		System.out.println(studList.size() + " rows inserted...");
		System.out.println("Thanks.");
	}
}
