package com.spring.JDBC.Spring_JDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.Spring_JDBC.entities.Student;





public  class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		String query="INSERT INTO public.\"Student\"(\r\n"
        		+ "	id, \"Address\", \"City\")\r\n"
        		+ "	VALUES (?, ?, ?);";
		int r=this.jdbcTemplate.update(query,student.getid(),student.getAddress(),student.getCity());
		System.out.println("Number of record update"+r);
		// TODO Auto-generated method stub
		return 0;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int updates(Student students) {
		
		String query="UPDATE public.\"Student\"\r\n"
				+ "	SET \"Address\"=?, \"City\"=?\r\n"
				+ "	WHERE id=?;";
		int res=jdbcTemplate.update(query,students.getid(),students.getAddress(),students.getCity());
		// TODO Auto-generated method stub
		return res;
	}
	@Override
	public Student getStudent(int studentid) {
		RowMapper<Student>rowMapper=new RowMapperImpl();
		String query="Select * from Student where id=?";
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentid);
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		//Selecting multiple student
		String query="Select * from Student";
		List<Student> student=this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	

}