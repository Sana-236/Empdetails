package com.test.empdetails.other;

public class Emp {
	
	private int id;
	private String name;
	private String department;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int id, String name, String department) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
	

}
