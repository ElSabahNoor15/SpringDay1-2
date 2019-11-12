package com.SpringApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.style.StylerUtils;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.SpringApp2.model.Student;
import com.SpringApp2.service.StudentServiceIntf;

@Controller("studentController")
public class StudentController {
	@Autowired
	StudentServiceIntf studentService;
	
	public boolean createStudent()
	{
		Student student = new Student();
		student.setId("001");
		student.setName("Ram");
		student.setGrade("A");
		boolean flag=studentService.createStudent(student);
		
		return flag;
		
		
	}
	public Student getStudent(String id)
	{
		System.out.println("Students:");
		return studentService.getStudent(id);
	}
	public List<Student> getAll(){
		 List<Student> list = studentService.getAll();
		 return list;
	}
	

}
