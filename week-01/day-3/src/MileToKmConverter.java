import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("How far is your home from your work in miles?");
        double userInput = scanner.nextDouble();
        double userInputInKm = userInput * 1.609344;
        System.out.println("It is " + userInputInKm + "in kilometers.");

    }
}
