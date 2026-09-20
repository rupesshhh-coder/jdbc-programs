package com.jdbc;

public class Student {

	int id;
	String name;
	String course;
	float per;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String course, float per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",course=" + course + ", per=" + per + "]";
	}

}
