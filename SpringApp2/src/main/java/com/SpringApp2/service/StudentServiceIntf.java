package com.SpringApp2.service;

import java.util.List;

import com.SpringApp2.model.Student;

public interface StudentServiceIntf {

	boolean createStudent(Student student);
	Student getStudent(String id);
	public List<Student> getAll();
	

}
