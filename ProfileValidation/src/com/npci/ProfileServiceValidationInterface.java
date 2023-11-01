package com.npci;

import java.util.List;

public interface ProfileServiceValidationInterface {
	void saveProfile( ProfileValidation profile);
	void deleteProfile(int profileId);
	List< ProfileValidation> getAllProfiles();
	

}