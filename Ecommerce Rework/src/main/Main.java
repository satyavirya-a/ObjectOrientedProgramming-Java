package main;


public class Main {
    public static void main(String[] args) {

        EcommerceSystem system = new EcommerceSystem();

        // Add products
//        system.addElectronicsProduct("Gaming Laptop", 1500, 24);
//        system.addFoodProduct("Bengbeng", 5, "2027-01-01");
//        system.addFashionProduct("Jacket", 120, "L");
        
        Product gaminglaptop = new Electronic("Gaming Laptop", 1500, 24);
        Product bengbeng = new Food("Bengbeng", 5, "2027-01-01");
        Product jacket = new Fashion("Jacket", 120, "L");

        system.addProductToSystem(gaminglaptop);
        system.addProductToSystem(bengbeng);
        system.addProductToSystem(jacket);
        // Show inventory
//        system.showInventoryFromSystem();

        // Customer
        Customer customer = new Customer(
                "Bibi",
                "bibi@email.com",
                "08123456789",
                "Jakarta, Indonesia"
        );

        // Shopping cart
        Cart cart1 = new Cart();
       
        system.addProductToCart(cart1, "Gaming Laptop");
        system.addProductToCart(cart1, "Premium Jacket");
        system.showCartFromSystem(cart1);

        // Checkout
        PaymentMethod creditcard1 = new CreditCard();
        ShippingMethod jne1 = new JNEShipping();
        NotificationMethod email1 = new EmailNotification();
        
        system.checkOutFromSystem(
                customer,
                cart1,
                creditcard1,
                jne1,
                email1
        );

        // Reporting
        system.printSalesReport();
    }
}
