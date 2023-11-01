package TestUnit;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Scanner;

import org.junit.Test;

import com.npci.Profile;

import Service.ProfileOperations;
import Service.ServiceFactory;

public class TestProfile {


	
//	ProfileOperations service= ServiceFactory.getInstance();
//	Scanner sc=new Scanner(System.in);
//	Boolean res1=service.save(new Profile(1,"tanvi","123",LocalDate.parse("2000-01-10"),767676767l))	;
//	Boolean res2=service.save(new Profile(2,"ash","666",LocalDate.parse("2000-11-12"),898989l))	;
//	int
//	@Test
//	public void SaveTest()
//	{
//		assertTrue(res1);
//	}
//	
//	@Test
//	
//	public void DeleteTest()
//	{
//		
//	}
ProfileOperations service= ServiceFactory.getInstance();
	Scanner sc=new Scanner(System.in);
	int option=0;
	do {
		System.out.println("1:SAVE PROFILE , 2:DELETE PROFILE , 3:Exit");
		option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			// ask details FROM USER
			Profile p=new Profile();
			System.out.println("Entere ID");
			int pid= sc.nextInt();
			p.setPid(pid);
			System.out.println("Entere name");
			String name= sc.next();
			p.setName(name);
			System.out.println("Entere Password");
			String pass= sc.next();
			p.setPasswprd(pass);
			System.out.println("Entere phone no");
			Long phone= sc.nextLong();
			p.setPhno(phone);
			System.out.println("Entere Date of Birth in format yyyy-mm-dd only");
			LocalDate dob=LocalDate.parse(sc.next());
			p.setDob(dob);
			service.save(p);
			System.out.println("THE PROFILE IS SAVED.......");
			service.Display();
		    break;
		
		    
		case 2:
			System.out.println("Enter id:");
			int id = sc.nextInt(); 
			service.delete(id);
			service.Display();
			System.out.println("PROFILE DELETED...........");
		   break;
			
		case 3:
			option=3;
			System.out.println("APPLICATION CLOSED............");
			break;
		}
		
	}while(option!=3);
	

	
//	ServiceFactory servFactory = new ServiceFactory();
//	
//	ProfileOperations ps = servFactory.getInstance();
//	
//	Profile p1 = new Profile(1, "Surendra", "Surendra", LocalDate.parse("1999-12-15"), 8723948797L);
//	
//	boolean added = ps.save(p1);
//	System.out.println(added);
//	
//	added = ps.save(new Profile(2, "Surendra", "Surendra", LocalDate.parse("1999-12-15"), 8723948797L));
//
//	System.out.println(added);
//	
//	boolean delete = ps.delete(p1);
//	System.out.println(delete);
//	
//	delete = ps.delete(p1);
//	System.out.println(delete);
}
}