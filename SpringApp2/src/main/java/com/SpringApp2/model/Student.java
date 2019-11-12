package com.SpringApp2.model;

public class Student {
	private String id;
	private String name;
	private String grade;
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(String id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	

}