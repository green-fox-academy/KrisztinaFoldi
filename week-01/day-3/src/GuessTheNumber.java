import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 12;
        System.out.println("Guess a number!");
        int guess = scanner.nextInt();

        while (answer != guess) {
            if (guess > answer) {
                System.out.println("The stored number is lower!");
            } else if (guess < answer) {
                System.out.println("The stored number is higher!");
            }
            System.out.println("Guess a number!");
            guess = scanner.nextInt();
        }
        if (answer == guess) {
            System.out.println("You found the number: " + answer);
        }
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8