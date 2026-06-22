package org.example.designiteTest;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  private List<String> orders = new ArrayList<>();

  public void createOrder(String item) {
    orders.add(item);
  }

  public void validateOrder(String item) {
    if (item == null || item.isEmpty()) {
      System.out.println("Invalid order");
    }
  }

  public double calculateTax(double price) {
    return price * 0.19;
  }

  public double calculateShipping(double price) {
    return price > 50 ? 0 : 5.99;
  }

  public void sendEmail(String address, String message) {
    System.out.println("Email sent to " + address + ": " + message);
  }

  public void sendSMS(String number, String message) {
    System.out.println("SMS sent to " + number + ": " + message);
  }

  public void updateInventory(String item, int quantity) {
    System.out.println("Inventory updated for " + item + ": " + quantity);
  }

  public void processPayment(double amount) {
    System.out.println("Payment processed: " + amount);
  }

  public void generateInvoice(String orderId) {
    System.out.println("Invoice generated for " + orderId);
  }

  public void logOrder(String orderId) {
    System.out.println("Order logged: " + orderId);
  }

  public void saveToDatabase(String orderId) {
    System.out.println("Order saved: " + orderId);
  }

  public void notifyWarehouse(String orderId) {
    System.out.println("Warehouse notified: " + orderId);
  }

  public void cancelOrder(String orderId) {
    System.out.println("Order cancelled: " + orderId);
  }

  public void refundPayment(double amount) {
    System.out.println("Refund processed: " + amount);
  }

  public void printReceipt(String orderId) {
    System.out.println("Receipt printed for " + orderId);
  }

  public void applyDiscount(double price, double percent) {
    System.out.println("Discount applied: " + (price * percent));
  }

  public void checkStock(String item) {
    System.out.println("Stock checked for " + item);
  }

  public void scheduleDelivery(String orderId) {
    System.out.println("Delivery scheduled for " + orderId);
  }

  public void trackOrder(String orderId) {
    System.out.println("Tracking order " + orderId);
  }

  public void escalateComplaint(String orderId) {
    System.out.println("Complaint escalated for " + orderId);
  }

  public void archiveOrder(String orderId) {
    System.out.println("Order archived: " + orderId);
  }
}
