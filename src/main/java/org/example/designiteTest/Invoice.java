package org.example.designiteTest;

public class Invoice {

    public double calculateTotal(Customer customer) {
        double total = customer.getOrder().getPrice()
                + customer.getOrder().getTax()
                - customer.getOrder().getDiscount();

        if (customer.getOrder().getStatus().equals("PREMIUM")) {
            total = total * customer.getOrder().getMultiplier();
        }

        return total;
    }
}

class Customer {
    private CustomerOrder order;
    public CustomerOrder getOrder() { return order; }
    public void setOrder(CustomerOrder order) { this.order = order; }
}

class CustomerOrder {
    private double price;
    private double tax;
    private double discount;
    private String status;
    private double multiplier;

    public double getPrice() { return price; }
    public double getTax() { return tax; }
    public double getDiscount() { return discount; }
    public String getStatus() { return status; }
    public double getMultiplier() { return multiplier; }

    public void setPrice(double price) { this.price = price; }
    public void setTax(double tax) { this.tax = tax; }
    public void setDiscount(double discount) { this.discount = discount; }
    public void setStatus(String status) { this.status = status; }
    public void setMultiplier(double multiplier) { this.multiplier = multiplier; }
}