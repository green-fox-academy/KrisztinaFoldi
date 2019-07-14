public class Power {
  public static void main (String[] args) {
    int x = powerN(3, 2);
    System.out.println(x);
  }
  private static int powerN (int base, int n) {
    if (n > 1) {
      int result = base * base ;
      n --;
      return powerN(result, n);
    } return base;
  }
}

//Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).