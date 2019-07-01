public class Sum {
        public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5};
        System.out.println(sum(numbers));

    }
       public static int sum (int[] numbers) {
            int sum = 0;

           for (int i = 0; i < numbers.length; i++) {
               sum += numbers[i];
           }

           return sum;
   }
}
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter