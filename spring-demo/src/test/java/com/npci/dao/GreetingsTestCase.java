package com.npci.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsTestCase {

	private static ApplicationContext context; 
	
	//execute only once before any test case begins
	
	@BeforeAll
	public static void load()
	{
		context=new ClassPathXmlApplicationContext("beans.xml");
	}
	//execute only once but after all the test case ends
	@AfterAll
	 public static void unload()
	 {
		ClassPathXmlApplicationContext context2 =(ClassPathXmlApplicationContext)context;
		context2.close();
	 }
	private Greetings greetings;
	//runs before each test case
	@BeforeEach
	public void initializeGreetings()
	{
		greetings=(Greetings)context.getBean("b1");
	}
	@AfterEach
	public void deinitializeGreetings()
	{
		greetings=null;
	}
	//runs after each test case
	@Test
	public void testGreetings()
	{
//		Greetings greetings =(Greetings)context.getBean("b1");
		String actual=greetings.greet("Alex", "Hindi");
		assertEquals("Namaskar Alex",actual);
		actual=greetings.greet("Alex","Kannada");
		assertEquals("Namaskar Alex",actual);
	}
}
