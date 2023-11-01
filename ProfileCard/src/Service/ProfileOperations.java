package Service;

import com.npci.Profile;

public interface ProfileOperations {

	boolean save(Profile profile);

	int delete(int id);
	
	void Display();

}