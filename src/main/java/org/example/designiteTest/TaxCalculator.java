package org.example.designiteTest;

public class TaxCalculator {

    public double calculate(double amount) {
        if (amount > 10000) {
            return amount * 0.42;
        }
        return amount * 0.19;
    }
}