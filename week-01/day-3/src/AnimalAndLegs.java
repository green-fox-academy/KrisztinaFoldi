import java.util.Scanner;
public class AnimalAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens the farmer has?");
        int userInput = scanner.nextInt();
        System.out.println("How many pigs has the farmer?");
        int userInput2 = scanner.nextInt();
        System.out.println("All animal legs on the farm: " + ((userInput * 2 ) + (userInput2 * 4 ) ));

    }
}
