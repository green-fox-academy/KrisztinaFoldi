package Fibonacci;

public class Fibonacci {
  public int fibonacciNumber = 5;

  public int fibonacciNumber(int number){
    if (number <= 1){
      return number;
    }
    return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
  }
}
