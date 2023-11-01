package com.Npci.Utility;
import com.Npci.*;
import com.Service.*;

public class UseroperationFactory {

	public static UserOperations getInstance()
	{
		UserOperations operation=new UserService();
		return operation;
	}
}
