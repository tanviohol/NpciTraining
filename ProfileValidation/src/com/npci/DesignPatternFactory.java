package com.npci;

public class DesignPatternFactory {
	public static ProfileServiceValidationInterface getInstance() {
		ProfileServiceValidationInterface operation = new ProfileServiceImpInterface();
		return operation;
	}

}
