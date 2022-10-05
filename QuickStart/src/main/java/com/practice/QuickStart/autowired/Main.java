package com.practice.QuickStart.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


	public static void main(String[] args) {
		
//		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Employee emp=ac.getBean(Employee.class);
		emp.empservice();
		
	}

}
