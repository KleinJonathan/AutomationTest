package org.example;

public class MathClass {
  private int a;
  private int b;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int multAB() {
    return a * b;
  }

  public int addAB() {
    return a + b;
  }

  public int subAB() {
    return a - b;
  }

  public int subBA() {
    return b - a;
  }

  public int divAB() {
    return a / b;
  }
}
