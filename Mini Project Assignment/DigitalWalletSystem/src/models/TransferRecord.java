package models;

import java.util.Random;

public class TransferRecord {
	private String recordId;
	private String senderName ;
	private String receiverName;
	private String transactionType;
	private double amount;
	
	
	
	public TransferRecord(String senderName, String receiverName, String transactionType, double amount) {
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.transactionType = transactionType;
		this.amount = amount;
		
		Random r = new Random();
		Integer angkaRandom100Sampai999 = 100 + r.nextInt(900);
		recordId = angkaRandom100Sampai999.toString();
	}



	public void getInfo(User u) {
		if (transactionType.equals("TOPUP")) {
			System.out.println("- (" + recordId + ")" + " Top Up " + amount);
		}
		
		else if (transactionType.equals("TRANSFER")){
			if (u.getName().equals(receiverName)) {
				System.out.println("- (" + recordId + ")" + " Received " + amount + " from " + senderName);
			}
			if (u.getName().equals(senderName)) {
				System.out.println("- ("+recordId + ")" + " Sent " + amount + " to " + receiverName);
			}
			
		}
		
	}
	
}
