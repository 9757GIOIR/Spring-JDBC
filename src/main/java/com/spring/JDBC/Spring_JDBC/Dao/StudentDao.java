package com.spring.JDBC.Spring_JDBC.Dao;

import java.util.List;

import com.spring.JDBC.Spring_JDBC.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int updates(Student students);
	
	public Student getStudent(int studentid);
	 public List<Student> getAllStudent();
	 

}
