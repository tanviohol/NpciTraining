package com.Npci.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Npci.Calculator;

public class TestCalculator {
	
	@Test
	public void testAdd()
	{
		Calculator c =new Calculator();
		int result=c.add(20,30);
		int expected=20+30;
		assertEquals(expected,result);
	}
	
	//testing for sub method
	@Test
	public void testSub()
	{
		Calculator c=new Calculator();
		int result=c.sub(200, 30);
		int expected =200-30;
		assertEquals(expected, result);
	}

}
