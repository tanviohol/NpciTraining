package com.npci.service;



import com.npci.beans.Wallet;

public interface WalletService  {
    // add funds
	  public void addFund(int fund);
	
	// show balance
	  public Wallet showBalance(int wallet_id);
	
	// fund transfer
	  public boolean transferFund(int fund,int wallet_id_issuere, int wallet_id_receiever);
}



