package com.npci;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class ProfileServiceSetImpl implements ProfileService {
	
	Set<Profile> profiles=new HashSet<>();

	// TO display all profiles stored in collection
	@Override
	public void displayAll()
	{
		Iterator<Profile> itr=profiles.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println("______");
		System.out.println("______");
	}
	
	// save  method profile addition
	@Override
	public int save(Profile pf) {
		
		// taking size before adding profile
		int before=profiles.size();
		profiles.add(pf);
		// size after adding profile
		int after=profiles.size();
		// if after is greater than before it means profile added
		if(after>before)
		  return 1;
		return -1;
	}
	
   // delete method for  profile deletion
	@Override
	public int delete(int id) {
		
		int exist=0;
		//check and delete the profile if provided id exist
		Iterator<Profile> itr= profiles.iterator();
	    Profile matchpf = null;
		while(itr.hasNext())
		{
			Profile pf=itr.next();
			if(pf.getPid()==(id))
			{
				 matchpf=pf;
				exist=1;
			}	
		}
		if(exist==1)
		{
		 profiles.remove(matchpf);
		 return 1;
		}
		else 
		  return -1;	
	}

	@Override
	public void loginToProfile(int profileId,String pswd)
	{
		// check if id is present or not
		int  exist=0;
		Profile matchPf=null;
		for(Profile pf :profiles)
		{
			if(pf.getPid()==profileId)
			{
				matchPf=pf;
				exist=1;
			}	
		}
		if(exist==0)
		{
			System.out.println("Please Enter valid id");
		}
		else {
			// if id present check for valid password or not
			if(matchPf.getPasswprd().equals(pswd))
				System.out.println("Login Successful...!!");
			else
				System.out.println("Invalid Password...");
		}

	}
}
