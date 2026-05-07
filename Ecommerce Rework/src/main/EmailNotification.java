package main;

public class EmailNotification extends NotificationMethod{

	public EmailNotification() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendNotif(Customer c) {
		System.out.println("Sending email to " + c.email);
	}
	
	

}
