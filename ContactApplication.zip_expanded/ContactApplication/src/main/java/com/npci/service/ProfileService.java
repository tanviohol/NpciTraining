package com.npci.service;

import java.time.LocalDate;
import java.util.List;

import com.google.common.base.Optional;
import com.npci.beans.Contact;
import com.npci.beans.Profile;

public interface ProfileService {
    // creating new profile
  public Profile createProfile(Profile profile);

  //edit profile
  public void editProfile(Profile pf);
  
  // view profile details
  public Optional<Profile>  showProfile(int profile_id);
  
  // show all profiles
  public List<Profile> showProfiles();
  
  //delete profile
  public void  deleteProfile(int profile_id);
  
  // add contact 
  public void addContact(int profile_id_ref,int wallet_id_ref);
  
  // view all contacts
  public List<Contact> showContacts(int profiile_id);
  
  // edit contact
  public void editContact();
  
  // delete contact
  public void deleteContact(int wallet_id_ref);
  
}
