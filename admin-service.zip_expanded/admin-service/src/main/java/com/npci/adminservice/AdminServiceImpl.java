package com.npci.adminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminServiceImpl {
	
	@Autowired
	private RestTemplate rest;

	public String findingEmployee(int id)
	{
		String response=rest.getForObject("http://Employee-App/api/employees"+id, String.class);
		
		return response;
	}
}
