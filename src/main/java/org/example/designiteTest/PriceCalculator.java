package org.example.designiteTest;

public class PriceCalculator {

    public double calculateForUS(double price) {
        double tax = price * 0.08;
        double shipping = price > 50 ? 0 : 5.99;
        return price + tax + shipping;
    }

    public double calculateForCanada(double price) {
        double tax = price * 0.08;
        double shipping = price > 50 ? 0 : 5.99;
        return price + tax + shipping;
    }
}