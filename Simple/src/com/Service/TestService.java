package com.Service;
import java.time.LocalDate;
import java.util.Scanner;
import com.Npci.*;
import com.Npci.Utility.UseroperationFactory;

public class TestService {
public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	UserOperations service= UseroperationFactory.getInstance(); // to call store() and findAll() 
    	int option =0; // user option to store or findAll or exit
    	do {
    		System.out.println("1:Store , 2:Find All , 3: Exit");
    		option = sc.nextInt();
    		
    		switch(option)
    		{
    		case 1:
    			// ask details and initialize the user and pass to UserServoce.store()
    			System.out.println("Entere name");
    			String name= sc.next();
    			System.out.println("Entere phone no");
    			Long phone= sc.nextLong();
    			System.out.println("Entere Date of Birth in format yyyy-mm-dd only");
    			LocalDate dob=LocalDate.parse(sc.next());
    			User user=new User(name,phone,dob);
    			int status = service.store(user);
    			if(status==1)
    				System.out.println("User stored..");
    			else
    				System.out.println("Failed to store..");
    			
    			break;
    		case 2:
    			// call the findAll and iterate the print user
    			User[] users= service.findAll();
    			for(User u: users)
    			{
    				System.out.println(u);
    				System.out.println("_____");
    			}
    			
    			break;
    			
    		case 3:
    			// to find user by name
    			System.out.println("ENTER THE NAME");
    			String fname=sc.next();
    			
    			user=service.findName(fname);
    			System.out.println(user.getName() + "birthday" +user.getDob());
    			break;
    		}
    		
    	}while(option!=3);
    	
    	
    }
}
