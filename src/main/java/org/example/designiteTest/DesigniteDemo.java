package org.example.designiteTest;

public class DesigniteDemo {

    public static void run() {
        // TaxCalculator
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(5000));
        System.out.println(taxCalculator.calculate(20000));

        // PriceCalculator
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println(priceCalculator.calculateForUS(100));
        System.out.println(priceCalculator.calculateForCanada(40));

        // UserService
        UserService userService = new UserService();
        userService.createUser("Max", "Mustermann", "max@example.com",
            "0123456789", "Hauptstr. 1", "Berlin",
            "10115", "Deutschland", 30, true);

        // OrderManager
        OrderManager orderManager = new OrderManager();
        orderManager.createOrder("Laptop");
        orderManager.validateOrder("Laptop");
        System.out.println(orderManager.calculateTax(199.99));
        System.out.println(orderManager.calculateShipping(40));
        orderManager.sendEmail("max@example.com", "Bestellung bestätigt");
        orderManager.sendSMS("0123456789", "Bestellung bestätigt");
        orderManager.updateInventory("Laptop", 5);
        orderManager.processPayment(199.99);
        orderManager.generateInvoice("ORD-1");
        orderManager.logOrder("ORD-1");
        orderManager.saveToDatabase("ORD-1");
        orderManager.notifyWarehouse("ORD-1");
        orderManager.cancelOrder("ORD-1");
        orderManager.refundPayment(199.99);
        orderManager.printReceipt("ORD-1");
        orderManager.applyDiscount(199.99, 0.1);
        orderManager.checkStock("Laptop");
        orderManager.scheduleDelivery("ORD-1");
        orderManager.trackOrder("ORD-1");
        orderManager.escalateComplaint("ORD-1");
        orderManager.archiveOrder("ORD-1");

        // Invoice mit echtem Customer/CustomerOrder (im Paket zugaenglich)
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setPrice(100.0);
        customerOrder.setTax(19.0);
        customerOrder.setDiscount(5.0);
        customerOrder.setStatus("PREMIUM");
        customerOrder.setMultiplier(0.9);

        Customer customer = new Customer();
        customer.setOrder(customerOrder);

        Invoice invoice = new Invoice();
        System.out.println(invoice.calculateTotal(customer));

        // CheckoutService mit echtem User/Cart
        User user = new User();
        user.setActive(true);
        user.setBanned(false);
        user.setCreditLimit(1000.0);
        user.setAddress("Hauptstr. 1");

        Cart cart = new Cart();
        cart.getItems().add("Laptop");
        cart.setTotal(199.99);

        CheckoutService checkoutService = new CheckoutService();
        System.out.println(checkoutService.canCheckout(user, cart));
    }
}