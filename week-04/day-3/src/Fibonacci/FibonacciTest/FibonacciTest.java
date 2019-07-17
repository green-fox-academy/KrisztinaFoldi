package Fibonacci.FibonacciTest;

import Fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
  Fibonacci number = new Fibonacci();

  @Test
  void doesTheFibonacciClassWorks() {
    assertEquals(5, number.fibonacciNumber(number.fibonacciNumber));
  }
}
