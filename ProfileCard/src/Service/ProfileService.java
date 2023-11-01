package Service;

import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

import com.npci.Profile;
//import com.npci.beans.Employee;

public class ProfileService implements ProfileOperations{

	Set<Profile> profiles = new HashSet<Profile>();
	
	

//	public Set<Profile> getProfiles() {
//		return Profiles;
//	}
//
//	public void setProfiles(Set<Profile> profiles) {
//		Profiles = profiles;
//	}
 // method to save profile
	@Override
	public boolean save(Profile profile) {
		return profiles.add(profile);
	}

	//method to delete profile
	@Override
	public int delete(int id) 
	{
		for (Profile p : profiles) {
		    if (p.getProfileId().equals(profileId)) {
		        profiles.remove(p);
		        break;
		    }
		}
	}

	public  void Display()
	{
		for(Object o : profiles)
		{
			System.out.println(o);
		}
//		System.out.println(Profiles.toArray().toString());
	}
}
