import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number!");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0 ) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }

        }
    }
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

