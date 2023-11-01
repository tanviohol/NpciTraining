package com.npci;

public interface ProfileService {

	// TO display all profiles stored in collection
	void displayAll();

	// save  method profile addition
	int save(Profile pf);

	// delete method for  profile deletion
	int delete(int id);

	void loginToProfile(int profileId, String pswd);

}