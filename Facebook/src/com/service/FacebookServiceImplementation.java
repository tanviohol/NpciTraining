package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.npci.Facebook;


public class FacebookServiceImplementation implements FacebookService {

	List<Facebook> obj= new ArrayList<>(); 
	
	
	@Override
	public boolean save(Facebook f) {
    return obj.add(f);
	}

	@Override
	public void deleteById(int id) {
		for(Facebook f: obj)
		{
		if(f.getId()==id)
		{
			obj.remove(f);
		}
		}
		
		
	}

	@Override
	public void displayAll() {
		Iterator<Facebook> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		
	}
	
	

}
