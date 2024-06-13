package com.spring.JDBC.Spring_JDBC.entities;

public class Student {
	private int id;
	private String Address;
	private String City;
	
	
	public Student(int id, String address, String city) {
		super();
		this.id = id;
		Address = address;
		City = city;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + id + ", Address=" + Address + ", City=" + City + "]";
	}
	

}
