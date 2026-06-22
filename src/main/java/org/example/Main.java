package org.example;

import org.example.designiteTest.DesigniteDemo;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main() {
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
  }
}
