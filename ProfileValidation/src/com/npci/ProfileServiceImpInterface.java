package com.npci;

import java.util.ArrayList;
import java.util.List;

public class ProfileServiceImpInterface implements ProfileServiceValidationInterface {
	
	private List< ProfileValidation> profiles = new ArrayList<>();

    public void saveProfile( ProfileValidation profile) {
        profiles.add(profile);
    }

    public void deleteProfile(int profileId) {
        profiles.removeIf(profile -> profile.getProfileId() == profileId);
    }

    public List< ProfileValidation> getAllProfiles() {
        return profiles;
    }

}