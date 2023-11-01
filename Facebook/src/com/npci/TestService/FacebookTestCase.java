package com.npci.TestService;



import org.junit.Test;

import com.npci.Facebook;
import com.service.FacebookFactory;
import com.service.FacebookService;

public class FacebookTestCase {
	
 FacebookService service =new FacebookFactory().getInstance(); 	
 
 boolean status1=service.save(new Facebook(1,"tanvi", "123"));
 
 @Test
 public void saveTest()
 {
	 boolean expected=true;
		assertEquals(expected,status1);

 }

}
