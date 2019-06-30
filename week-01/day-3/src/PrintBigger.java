import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int number1 = scanner.nextInt();
        System.out.println("Give me another number: ");
        int number2 = scanner.nextInt();
        if ( number1 >= number2 ) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
// Write a program that asks for two numbers and prints the bigger one