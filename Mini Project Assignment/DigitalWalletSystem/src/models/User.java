package models;

import company.WalletCompany;

public class User {
	
	private String userId;
	private String name;
	private Wallet wallet;
	private WalletCompany company;
	
	public User(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
		wallet = new Wallet("W"+ userId);
		company = null;
		
	}
	
	public void transferTo(User receiver, double amount) {
		receiver.wallet.increaseBalance(amount);
		this.wallet.decreaseBalance(amount);
		
		TransferRecord r = new TransferRecord(name, receiver.getName(), "TRANSFER", amount);
		//MIKIRIN BEDANYA GIMANA
		this.wallet.addRecord(r);
		receiver.wallet.addRecord(r);
	}
	
	public void printHistoryData() {
		for (TransferRecord r : wallet.getHistory()) {
			r.getInfo(this);
		}
	}
	
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public WalletCompany getCompany() {
		return company;
	}

	public void setCompany(WalletCompany company) {
		this.company = company;
	}
	
	
	
	
}
