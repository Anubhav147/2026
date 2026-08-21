package com.raj.demoRest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	Connection con = null;
	ResultSet rs;
	Statement st;
	String url = "jdbc:postgresql://localhost:5432/JDBC";
	String user = "postgres";
	String password = "postgres";
	Student s = new Student();

	public StudentRepository() {
		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public List<Student> getListOfStudents() {
		List<Student> students = new ArrayList<>();
		String sql = "select * from students";
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAge(rs.getInt(3));
				students.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return students;

	}

	public Student getStudent(int id) {

		String sql = "select * from students where id=" + id;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {

				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAge(rs.getInt(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;

	}

	public void createEntry(Student s) {
		String sql = "Insert into students values(?, ?, ?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setInt(3, s.getAge());
			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void updateEntry(Student s) {
		String sql = "Update students set age=? where name=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, s.getAge());
			pst.setString(2, s.getName());
			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteEntry(Student s) {
		String sql = "Delete from students where name = ?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());

			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Student getStudentDeleted(int id) {
		String sql = "Delete from students where id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, s.getId());

			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return s;
	}

}
