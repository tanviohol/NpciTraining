package com.npci.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.annotation.JsonValue;
import com.npci.adminservice.AdminServiceImpl;

public class AdminController {
	
	@Autowired
	private AdminServiceImpl service;
	@Value("${message}")
	private String property;
	
	@GetMapping(path="/employee/{id}")
	public String getMessage()
	{
		return property;
	}
	
	
	@GetMapping(path="/{id}")
	public ResponseEntity<String> finder(@PathVariable("id") int id)
	{
		String result=service.findingEmployee(id);
		return ResponseEntity.status(200).body(result);
	}

}
