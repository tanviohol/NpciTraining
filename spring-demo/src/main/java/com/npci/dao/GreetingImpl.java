package com.npci.dao;

import java.util.HashMap;
import java.util.Map;

public class GreetingImpl implements Greetings {
	
	private static Map<String , String> map; 
	
	public GreetingImpl()
	{
		map=new HashMap<>();
		map.put("HINDI", "Namaskar");
		map.put("KANNADA", "Namaskar");
		map.put("ENGLISH", "hello");
		map.put("FRENCH", "Bojour");
	}
	
	public String greet(String name , String language)
	{
		String lang=language.toUpperCase();
		String value=map.get(lang);
		//System.out.println(value);
		return value +" "+name;
	}

}
