package org.example;

import org.example.designiteTest.DesigniteDemo;
import org.example.designiteTest.SqlUserRepository;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    System.out.println("Starte Test");

    MathClass m = new MathClass();
    m.setA(12);
    System.out.println(m.getA());
    System.out.println(m.getA());
    System.out.println(m.getA());
    System.out.println(m.getA());
    System.out.println(m.getA());

    // Alle Aufrufe des designiteTest-Pakets
    DesigniteDemo.run();

    // Untrusted input (command-line arguments) flows without validation into SQL queries.
    // CodeQL treats args as a RemoteFlowSource and reports the SQL injection.
    if (args.length >= 4) {
      SqlUserRepository repo = new SqlUserRepository();
      repo.findUsersByName(args[0]);
      repo.updateUser(Integer.parseInt(args[1]), args[2], args[3], 30, true);
      repo.deleteUser(args[1]);
    }
  }
}
