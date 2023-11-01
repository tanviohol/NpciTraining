package com.npci;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ProfileValidationTest {
ProfileServiceValidationInterface service = new DesignPatternFactory().getInstance();
	
	@Test
	public void testSaveProfile() {
		ProfileValidation profile = new ProfileValidation(1, "John Doe", "john@example.com", "Password123", "5551234567");
        service.saveProfile(profile);
        List<ProfileValidation> profiles = service.getAllProfiles();
        assertEquals(1, profiles.size());
    }
	
	@Test
	public void testDeleteProfile() {
		ProfileValidation profile = new ProfileValidation(2, "Alice Smith", "alice@example.com", "Password456", "5559876543");
        service.saveProfile(profile);
        service.deleteProfile(2);
        List<ProfileValidation> profiles = service.getAllProfiles();
        assertEquals(0, profiles.size());
    }
	
	@Test
	 public void testInvalidProfile() {
        try {
        	ProfileValidation invalidProfile = new ProfileValidation(3, "Bob", "bobemail", "12345", "555");
            service.saveProfile(invalidProfile);
            fail("Invalid profile should not be saved.");
        } catch (IllegalArgumentException e) {
            
        }
    }
}
