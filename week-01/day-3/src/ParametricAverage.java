import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many times should I ask for a number? ");
    double numberOfNumbers = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < numberOfNumbers; i++) {
      System.out.println("Give me an integer pliiizzz!");
      Scanner scanner1 = new Scanner(System.in);
      int numberFromInput = scanner.nextInt();
      sum += numberFromInput;
    }
    double average = sum / numberOfNumbers;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4