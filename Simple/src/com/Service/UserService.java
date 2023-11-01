package com.Service;
import com.Npci.*;
// service layer class
public class UserService implements UserOperations {

	 private static User[] users=new User[5]; // [null null null null null]
	 // we need a counter track the index  of array to know many objects are stored
	 private static int index=0;
	 //store method
	 @Override
	public int store(User user)
	 {
		 // return 1 if stored
		 if(index>=5)
		 {
			 return -1;
		 }
		 else
		 {
		 users[index++] = user;
		 return 1;
		 }
	 }
	 // find all method
	 @Override
	public User[] findAll()
	 {
		 User[] users1=new User[index];
		 int index2=0;
		 for(User u : users)
		 {
			 if(u!=null)
			 {
				 users1[index2++]=u;
			 }
		 }
		 
		 return users1;
	 }
	 @Override
	public User findName(String name)
	 {
		 User[] array=findAll();
		 for(User u : array)
		 {
			 if(u.getName().equals(name))
			 {
				 return u;
			 }
			 
		 }
		 return null;
	 }
	 
	 
	}