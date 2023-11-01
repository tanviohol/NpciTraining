package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="wallet_id")
	private int wallet_id;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="account_number_ref")
	private Account account;

	public Wallet(int wallet_id, double amount, Account account) {
		super();
		this.wallet_id = wallet_id;
		this.amount = amount;
		this.account = account;
	}


	public int getWallet_id() {
		return wallet_id;
	}


	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
}
