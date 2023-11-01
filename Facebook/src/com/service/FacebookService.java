package com.service;

import com.npci.Facebook;

public interface FacebookService {

	public boolean save(Facebook f);
	public void deleteById(int id);
	public void displayAll();
}
