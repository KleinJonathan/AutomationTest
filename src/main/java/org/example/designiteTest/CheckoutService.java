package org.example.designiteTest;

public class CheckoutService {

    public boolean canCheckout(User user, Cart cart) {
        if (user != null && user.isActive() && !user.isBanned()) {
            if (cart != null && cart.getItems().size() > 0) {
                if (cart.getTotal() > 0 && cart.getTotal() < user.getCreditLimit()) {
                    if (user.getAddress() != null && !user.getAddress().isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class User {
    private boolean active;
    private boolean banned;
    private double creditLimit;
    private String address;

    public boolean isActive() { return active; }
    public boolean isBanned() { return banned; }
    public double getCreditLimit() { return creditLimit; }
    public String getAddress() { return address; }
}

class Cart {
    private java.util.List<String> items = new java.util.ArrayList<>();
    private double total;

    public java.util.List<String> getItems() { return items; }
    public double getTotal() { return total; }
}
