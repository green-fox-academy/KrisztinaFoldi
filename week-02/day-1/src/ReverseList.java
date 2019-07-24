import java.util.Arrays;

public class ReverseList {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] newAj = new int[aj.length];


    for(int j = 0; j < aj.length; j++) {
      newAj[aj.length - 1 - j] = aj[j];
    }

    for(int i = 0; i < aj.length; i++) {
      aj[i] = newAj[i];
    }
    
    System.out.println(Arrays.toString(newAj));
  }
}

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`