package com.SpringApp1.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringApp1.model.Candidate;
import com.SpringApp1.model.Department;
import com.SpringApp1.model.Employee;
import com.SpringApp1.model.Product;
import com.SpringApp1.model.TextEditor;
import com.SpringApp1.service.MathService;

public class AppTest1 {

	
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("----------");

		//Candidate c = (Candidate)ctx.getBean("c1");
		//System.out.println(c);
//		c.setAddress("Mumbai");
//		System.out.println(c);
//		Candidate cc = (Candidate)ctx.getBean("c1");
//		System.out.println(cc);
//		MathService ms=(MathService)ctx.getBean("dao");
//		System.out.println(ms.add(34, 90));
//		System.out.println(ms.power(34, 90));
//		System.out.println(dao.add(34, 90));
//		System.out.println(dao.power(34, 90));
		//TextEditor t= (TextEditor)ctx.getBean("te");
	//	t.write();
		//Employee emp = (Employee)ctx.getBean("emp");
		//Department dep= (Department)ctx.getBean("dep");
		//System.out.println(emp.getFullname()+" "+emp.getDepartment().getName());
		//((AbstractApplicationContext)ctx).close();
		Product pro = (Product)ctx.getBean("pro");
		//Department dep= (Department)ctx.getBean("dep");
		System.out.println(pro.getPname()+" "+pro.getCategory().getName());
		
	}

}
