package com.SpringApp2.Dao;

import java.util.List;

import com.SpringApp2.model.Student;

public interface StudentDaoIntf {
	public boolean createStudent(Student student);
	public Student getStudent(String id);
	public List<Student> getAll();
}
