package models;

import java.util.ArrayList;

public class Wallet {
	
	private String walletId ;
	private double balance ;
	private ArrayList<TransferRecord> history;
	
	protected Wallet(String walletId) {
		this.walletId = walletId;
		balance = 0;
		history = new ArrayList<>();
	}
	
	
	public void topUp(double amount) {
		increaseBalance(amount);
		TransferRecord r = new TransferRecord("SYSTEM", null, "TOPUP" , amount);
		addRecord(r);
	}
	
	
	public void increaseBalance(double amount) {
		balance += amount;
	}
	
	public void decreaseBalance(double amount) {
		balance -= amount;
	}
	
	public void addRecord(TransferRecord r) {
		history.add(r);
	}


	public String getWalletId() {
		return walletId;
	}


	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public ArrayList<TransferRecord> getHistory() {
		return history;
	}


	public void setHistory(ArrayList<TransferRecord> history) {
		this.history = history;
	}
	
	
	
	
}
