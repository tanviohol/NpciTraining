package com.npci;



public class ProfileServiceFactory {
	
	public static ProfileService getInstance()
	{
		ProfileService service = new ProfileServiceSetImpl();
		return service;
	}

}
