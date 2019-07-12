public class SumDigit {
  public static void main (String[] args) {
    int sumDigit = addNumbers(123, 0);
    System.out.println(sumDigit);
  }

  private static int addNumbers(int n, int sum) {
    if (n > 0) {
      int modulo = n % 10;
      int divided = n / 10;
      sum += modulo;
      return addNumbers(divided, sum);
    } return sum;


    }

}
