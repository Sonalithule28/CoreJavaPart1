package com.CollectionFramework;

public class Student {

	private int studentAge;
	private String studentName;
	private String studentCity;

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	
	}
	@Override
	 public String toString() {
	  return "Student [studentAge=" + studentAge + ", studentName=" + studentName + ", studentCity=" + studentCity
	    + "]";
	 }
	
}

