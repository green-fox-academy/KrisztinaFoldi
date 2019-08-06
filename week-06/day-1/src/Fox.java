import java.awt.*;
import java.util.ArrayList;

public class Fox {
  String name;
  Color color;
  int age;

  public Fox(String name, Color color, int age) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public static void main(String[] args) {
    ArrayList<Fox> lisOfFoxes = new ArrayList();
    Fox greenFox = new Fox("GreenFox", Color.green, 7);
    lisOfFoxes.add(greenFox);
    Fox blueFox = new Fox("BlueFox", Color.blue, 4);
    lisOfFoxes.add(blueFox);
    Fox yellowFox = new Fox("YellowFox", Color.yellow, 3);
    lisOfFoxes.add(yellowFox);
    Fox grayFox = new Fox("GrayFox", Color.gray, 2);
    lisOfFoxes.add(grayFox);
    Fox redFox = new Fox("RedFox", Color.red, 1);
    lisOfFoxes.add(redFox);

    //Write a Stream Expression to find the foxes with green color!
    lisOfFoxes.stream()
            .filter(x -> x.color == Color.green)
            .forEach();
  }


}
