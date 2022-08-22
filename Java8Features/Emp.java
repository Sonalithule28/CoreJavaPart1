package com.Java8Features;

public class Emp {
	int id;
	String name1;
	float salary;
	public Object name;


	public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name1 = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	}


