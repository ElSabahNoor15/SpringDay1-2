package com.SpringApp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringApp2.Dao.StudentDaoIntf;
import com.SpringApp2.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceIntf{
	@Autowired
	StudentDaoIntf studentDao;
	
	public boolean createStudent(Student student)
	{
		boolean flag =studentDao.createStudent(student);
		return flag;
	}



	public Student getStudent(String id) 
		{
			Student s =studentDao.getStudent(id);
			return s;
		}



	public List<Student> getAll() {
		List<Student> list =  studentDao.getAll();
		return list;
	}
	
	

}
