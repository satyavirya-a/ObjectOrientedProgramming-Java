package main;

public class WhatsAppNotification extends NotificationMethod {

	public WhatsAppNotification() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendNotif(Customer c) {
		System.out.println("Sending WhatsApp to " + c.phone);
	}

}
