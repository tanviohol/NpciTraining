package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contact_id")
	private int contact_id;
	
	@Column(name="profile_id_ref")
	private Profile profile;
	
	@Column(name="wallet_id_ref")
	private Wallet Wallet;

	public Contact(int contact_id, Profile profile, com.npci.beans.Wallet wallet) {
		super();
		this.contact_id = contact_id;
		this.profile = profile;
		Wallet = wallet;
	}

	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", profile=" + profile + ", Wallet=" + Wallet + "]";
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Wallet getWallet() {
		return Wallet;
	}

	public void setWallet(Wallet wallet) {
		Wallet = wallet;
	}
}
