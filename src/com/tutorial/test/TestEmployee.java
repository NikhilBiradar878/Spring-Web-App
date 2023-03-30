package com.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee)context.getBean("employeeBean");
		System.out.println(employee.getEmployeeName());
	}

}
