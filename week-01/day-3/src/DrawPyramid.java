import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How high is the pyramid?");
        int height = scanner.nextInt();
        int star = 0;

        for ( int i = 1; i <= height; i += 1) {
            for ( int space = 1; space <= (height - i ); space++) {
                System.out.print(" ");
            }
            for ( star = 0; star < i * 2 - 1; star++){
                System.out.print("* ");
                star ++;
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//

//     *     1  4 szunet
//    ***    3  3
//   *****   5  2
//  *******  7  1
// ********* 9  0

// The pyramid should have as many lines as the number was