package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestContainer 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		Employee employee1 =(Employee) context.getBean("employee1");
		Employee employee2 =(Employee) context.getBean("employee2");
		Employee employee3 =(Employee) context.getBean("employee3");
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		
	}

}
