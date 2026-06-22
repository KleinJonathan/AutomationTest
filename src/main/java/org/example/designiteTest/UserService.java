package org.example.designiteTest;

public class UserService {

  public void createUser(
      String firstName,
      String lastName,
      String email,
      String phone,
      String address,
      String city,
      String zipCode,
      String country,
      int age,
      boolean isPremium) {
    System.out.println("Creating user: " + firstName + " " + lastName);
  }
}
