package company;

import java.util.ArrayList;

import models.User;

public class WalletCompany {

	private String companyId;
	private String companyName ;
	private ArrayList<User> users;
	
	public WalletCompany(String companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
		users = new ArrayList<>();
	}
	
	public void registerUser(User u) {
		users.add(u);
		u.setCompany(this);
	}
	

	public User findUserById(String id) {
		for (User user : users) {
			if (user.getUserId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	public void  printAllWallets() {
		System.out.println("Company: " + companyName);
		System.out.println();
		
		for (User user : users) {
			System.out.println("User: " + user.getName());
			System.out.println("Balance: " + user.getWallet().getBalance());
			System.out.println("History:");
			user.printHistoryData();
			System.out.println();
		}
	}
	
}
