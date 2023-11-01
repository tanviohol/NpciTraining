package com.npci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.beans.Profile;

public interface ProfileDao extends JpaRepository<Profile , Integer> {
	
	@Query("select p from Profile p where p.email_id=?1")
	public List<Profile> findByEmail(String email );

}
