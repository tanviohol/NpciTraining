package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Contact;

public interface ContactDao extends JpaRepository<Contact ,Integer> {
	
	//auto implemented CURD method

}
