package com.service;

public class FacebookFactory {
	
	public FacebookService getInstance()
	{
	FacebookService service= new FacebookServiceImplementation();
	return service;
	}
}
