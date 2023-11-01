package com.Service;

import com.Npci.User;

public interface UserOperations {

	//store method
	int store(User user);

	// find all method
	User[] findAll();

	User findName(String name);

}