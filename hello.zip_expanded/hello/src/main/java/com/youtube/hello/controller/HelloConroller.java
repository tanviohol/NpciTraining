package com.youtube.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloConroller {

	@GetMapping(path = "/greet")
	public String sayhi()
	{
	return "hello";	
	}
}
