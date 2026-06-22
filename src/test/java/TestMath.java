import static org.junit.jupiter.api.Assertions.*;

import org.example.MathClass;
import org.junit.jupiter.api.Test;

public class TestMath {

  @Test
  public void math_subAB() {
    MathClass m = new MathClass();
    m.setA(12);
    assertEquals(12, m.subAB());
  }

  @Test
  public void math_subBA() {
    MathClass m = new MathClass();
    m.setA(12);
    assertEquals(-12, m.subBA());
  }

  @Test
  public void math_multiplyWithZero() {
    MathClass m = new MathClass();
    m.setA(12);
    assertEquals(0, m.multAB());
  }

  @Test
  public void math_multiply() {
    MathClass m = new MathClass();
    m.setA(12);
    m.setB(2);
    assertEquals(24, m.multAB());
  }

  @Test
  public void math_multiply2() {
    MathClass m = new MathClass();
    m.setA(12);
    m.setB(3);
    assertEquals(36, m.multAB());
  }

  @Test
  public void math_multiply3() {
    MathClass m = new MathClass();
    m.setA(12);
    m.setB(4);
    assertEquals(48, m.multAB());
  }

  @Test
  public void math_divZero() {
    MathClass m = new MathClass();
    m.setA(12);
    m.setB(0);
    assertThrows(ArithmeticException.class, m::divAB);
  }

  //
  // Schleche Tests für Designite Java
  //

  // ❌ Assertion Roulette - mehrere Assertions ohne Message
  @Test
  public void testAll() {
    MathClass math = new MathClass();
    math.setA(10);
    math.setB(5);

    assertEquals(50, math.multAB());
    assertEquals(15, math.addAB());
    assertEquals(5, math.subAB());
    assertEquals(-5, math.subBA());
    assertEquals(2, math.divAB());
  }

  // ❌ Eager Test - testet zu viele Dinge auf einmal
  @Test
  public void testEverything() {
    MathClass math = new MathClass();
    math.setA(20);
    math.setB(4);
    assertEquals(24, math.addAB());
    math.setA(100);
    assertEquals(104, math.addAB());
    math.setB(0);
    assertEquals(100, math.addAB());
    assertEquals(0, math.multAB());
  }

  // ❌ Mystery Guest - magische Zahlen ohne Erklärung
  @Test
  public void test1() {
    MathClass math = new MathClass();
    math.setA(7);
    math.setB(3);
    assertEquals(21, math.multAB());
  }

  // ❌ Redundant Print - unnötiger Output in Tests
  @Test
  public void test2() {
    MathClass math = new MathClass();
    math.setA(8);
    math.setB(2);
    System.out.println("Testing division...");
    int result = math.divAB();
    System.out.println("Result: " + result);
    assertEquals(4, result);
  }

  // ❌ Empty Test - leerer/sinnloser Test
  @Test
  public void test3() {
    MathClass math = new MathClass();
    assertNotNull(math);
  }

  // ❌ Duplicate Assertion - identischer Test wie testAll
  @Test
  public void test4() {
    MathClass math = new MathClass();
    math.setA(10);
    math.setB(5);
    assertEquals(50, math.multAB());
    assertEquals(15, math.addAB());
  }

  // ❌ Conditional Test Logic - if/else in Test
  @Test
  public void test5() {
    MathClass math = new MathClass();
    math.setA(9);
    math.setB(3);
    int result = math.divAB();
    if (result == 3) {
      assertTrue(true);
    } else {
      assertFalse(false);
    }
  }

  // ❌ Sleepy Test - unnötiger Thread.sleep
  @Test
  public void test6() throws InterruptedException {
    MathClass math = new MathClass();
    math.setA(5);
    math.setB(5);
    Thread.sleep(100);
    assertEquals(25, math.multAB());
  }
}
