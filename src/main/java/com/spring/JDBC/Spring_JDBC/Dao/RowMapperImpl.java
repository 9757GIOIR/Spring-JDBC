package com.spring.JDBC.Spring_JDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.Spring_JDBC.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setid(rs.getInt(1));
		student.setAddress(rs.getString(2));
		
		
		return student;
	}

}
