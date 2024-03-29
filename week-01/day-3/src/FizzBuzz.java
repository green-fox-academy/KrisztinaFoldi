public class FizzBuzz {
    public static void main(String[] args) {
        for ( int a = 1; a <= 100; a ++) {
            if ( (( a % 5) == 0 ) &&  ((a % 3 ) == 0)) {
                System.out.println("FizzBuzz");
            } else if ( ( a % 5) == 0 ) {
                System.out.println("Buzz");
            } else if  ( ( a % 3 ) == 0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
        }
    }
}
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.