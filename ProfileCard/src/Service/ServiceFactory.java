package Service;

public class ServiceFactory {
	
	public static ProfileOperations getInstance()
	{
		ProfileOperations service = new ProfileService();
		return service;
	}

}
