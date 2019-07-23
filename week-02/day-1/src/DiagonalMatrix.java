public class DiagonalMatrix {
  public static void main(String[] args) {
    int number = 30;
    int[][] matrix = new int[number][number];

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
       matrix[i][j] = 0;
      }
      matrix[i][i] = 1;

    }

    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}


//// - Create (dynamically) a two dimensional array
////   with the following matrix. Use a loop!
////
////   1 0 0 0
////   0 1 0 0
////   0 0 1 0
////   0 0 0 1
////
//// - Print this two dimensional array to the output