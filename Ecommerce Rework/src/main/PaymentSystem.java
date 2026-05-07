package main;

public class PaymentSystem {
	
	
	public PaymentSystem() {

	}
	
	public void checkout(Customer customer, Cart c, PaymentMethod payment, ShippingMethod shipping, NotificationMethod notif) {
		   
		   double totalBelanja = c.calculateTotalBelanja();
		   
	       // Payment INI HARUS NYA JANGAN LANGSUNG STRING
	   		//nanti di main itu langsung buat 
//	       if (paymentMethod.equalsIgnoreCase("creditcard")) {
//	           processCreditCardPayment(customer);
//	       } else if (paymentMethod.equalsIgnoreCase("paypal")) {
//	           processPaypalPayment(customer);
//	       } else if (paymentMethod.equalsIgnoreCase("banktransfer")) {
//	           processBankTransfer(customer);
//	       }
		   
		   payment.processPayment(customer, totalBelanja);
	       // Shipping
//	       if (shippingMethod.equalsIgnoreCase("jne")) {
//	           shipByJNE(customer);
//	       } else if (shippingMethod.equalsIgnoreCase("jnt")) {
//	           shipByJNT(customer);
//	       } else if (shippingMethod.equalsIgnoreCase("sicepat")) {
//	           shipBySiCepat(customer);
//	       }
	       shipping.processShipping(customer);

	       // Notification
//	       if (notificationMethod.equalsIgnoreCase("email")) {
//	           sendEmail(customer);
//	       } else if (notificationMethod.equalsIgnoreCase("sms")) {
//	           sendSMS(customer);
//	       } else if (notificationMethod.equalsIgnoreCase("whatsapp")) {
//	           sendWhatsApp(customer);
//	       }
	       notif.sendNotif(customer);

	       printInvoice(customer, c);
	       saveOrderToMySQL();
	   }
	
    
    public void printInvoice(Customer customer, Cart c) {
        System.out.println("===== INVOICE =====");
        System.out.println("Customer: " + customer.name);
        for (Product p : c.getCartList()) {
            System.out.println(p.name + " - $" + p.price);
        }
        System.out.println("TOTAL: $" + c.calculateTotalBelanja());
    }
    
    public void saveOrderToMySQL() {
        System.out.println("Saving order to MySQL database...");
    }

    public void saveOrderToMongoDB() {
        System.out.println("Saving order to MongoDB database...");
    }

   
    

}
