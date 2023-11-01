package com.npci.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGreetings {

	public static void main(String[] args) {
		//to use the object in the spring container- application context
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Greetings greetings=(Greetings)context.getBean("b1");
		String result=greetings.greet("Sunil", "HINDI");
		System.out.println(result);
		
	}
}
