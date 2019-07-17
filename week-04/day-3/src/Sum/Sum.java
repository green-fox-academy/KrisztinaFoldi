package Sum;

import java.util.ArrayList;

public class Sum {

  public ArrayList<Integer> wut = new ArrayList<>();

  public int sumArrayList(ArrayList<Integer> integers) {
    if (integers == null) {
      return 0;
    }int sum = 0;
    for (int i = 0; i < integers.size(); i++) {
     sum += integers.get(i);
    } return sum;
  }


}
