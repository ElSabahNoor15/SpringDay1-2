package com.SpringApp2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.SpringApp2.Dao.StudentDaoImpl;
import com.SpringApp2.controller.StudentController;
import com.SpringApp2.model.Student;


public class App 

{
	private static ApplicationContext applicationContext;
    public static void main( String[] args )
    {
      applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    //  StudentController controller = (StudentController)applicationContext.getBean("studentController");
    //  System.out.println(controller.createStudent());
    	
//    	
//    	StudentController controller = (StudentController)applicationContext.getBean("studentController");
//        System.out.println(controller.getStudent("002")); //for searching data
//        System.exit(0);
      StudentController controller = (StudentController)applicationContext.getBean("studentController");
      List<Student> list = controller.getAll();
      System.out.println(list);
      System.exit(0);
      
      
    }
}
