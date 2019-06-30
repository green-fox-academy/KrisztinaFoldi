import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int userInput1 = scanner.nextInt();
        System.out.println("Give me a number!");
        int userInput2 = scanner.nextInt();
        System.out.println("Give me a number!");
        int userInput3 = scanner.nextInt();
        System.out.println("Give me a number!");
        int userInput4 = scanner.nextInt();
        System.out.println("Give me a number!");
        int userInput5= scanner.nextInt();
        int userInputSum = userInput1+userInput2+userInput3+userInput4+userInput5;
        System.out.println("Sum: " + userInputSum + ", " + "Average: " + (userInputSum / 2.) );

    }
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    //  Sum: 22, Average: 4.4

}
