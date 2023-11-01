package com.npci.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.npci.dao.ProfileDao;
//
//import jakarta.transaction.Transactional;
//
//@Service("registrationService") // id="registrationService"
//public class ProfileServiceImpl implements ProfileService {
//	@Autowired
//	private ProfileDao profileDao;
//
//	// also we are going initialize account and wallet at time of profile creation
//	@Autowired
//	private AccountDao accountDao;
//	@Autowired
//	private WalletDao walletDao;
//
//	@Override
//	@Transactional
//	public Profile createProfile(String name, String email_id, String password, LocalDate dob, long phone) {
//
//		ProfileValidation validate = new ProfileValidation();
//		Profile pf = new Profile(0, name, email_id, password, dob, phone);
//
//		if (validate.validateName(name)) {
//			if (validate.validateEmail(email_id)) {
//				if (validate.validatePassword(password)) {
//					if (validate.validateDob(dob)) {
//						if (validate.validatePhone(phone)) {
//
////           all details are in correct format so we can create profile
////	         also we are going initialize account and wallet  at time of profile creation
//
//							Account accnt = new Account();
//							Account registerAccnt = accountDao.save(accnt);
//							Wallet wallet = new Wallet();
//							Wallet registerWallet = walletDao.save(wallet);
//							registerWallet.setAccount(registerAccnt);
//							pf.setWallet(registerWallet);
//
//							Profile newPf = profileDao.save(pf);
//							return newPf;
//						} else {
//							throw new IllegalArgumentException("Phone number must have 10 digits..");
//						}
//					} else {
//						throw new IllegalArgumentException("Age must  above 18..");
//					}
//				} else {
//					throw new IllegalArgumentException("Password must have mention format..");
//				}
//			} else {
//				throw new IllegalArgumentException("Provide email id with corect format..");
//			}
//		} else {
//			throw new IllegalArgumentException("Name must be between 5 and 60 characters.");
//		}
//	}
//
//	@Override
//	public void editProfile(Profile pf) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Optional<Profile> showProfile(int profile_id) {
//
//		Optional<Profile> op = profileDao.findById(profile_id);
//		//
//		return op;
//	}
//
//	@Override
//	public List<Profile> showProfiles() {
//
//		return profileDao.findAll();
//	}
//
//	@Override
//	public void deleteProfile(int profile_id) {
//
//		profileDao.deleteById(profile_id);
//
//	}
//
//	@Override
//	public void addContact(int profile_id_ref, int wallet_id_ref) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<Contact> showContacts(int profiile_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void editContact() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteContact(int wallet_id_ref) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.time.LocalDate;
import java.util.List;

import com.google.common.base.Optional;
import com.npci.beans.Contact;
import com.npci.beans.Profile;

public class ProfileServiceImpl implements ProfileService{

	@Override
	public Profile createProfile(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editProfile(Profile pf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Profile> showProfile(int profile_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> showProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProfile(int profile_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addContact(int profile_id_ref, int wallet_id_ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contact> showContacts(int profiile_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editContact() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContact(int wallet_id_ref) {
		// TODO Auto-generated method stub
		
	}
	
}