import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number");
        int linesNumber = scanner.nextInt();
        String star = "*";
        int x = 1;

        while ( x <= linesNumber ) {
            System.out.println( star );
            x += 1;
            star += "*";
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
