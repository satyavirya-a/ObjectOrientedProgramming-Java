package main;

public class SMSNotification extends NotificationMethod {

	public SMSNotification() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendNotif(Customer c) {
		System.out.println("Sending SMS to " + c.phone);
	}

}
