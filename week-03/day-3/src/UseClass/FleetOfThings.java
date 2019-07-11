package UseClass;
import java.util.ArrayList;
import java.util.List;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing thing = new Thing("Get Milk");
    Thing thing1 = new Thing("Remove the obstacles");
    Thing thing2 = new Thing("Stand up");
    Thing thing3 = new Thing("Eat lunch");

    fleet.add(thing);
    fleet.add(thing1);
    fleet.add(thing2);
    thing2.complete();
    fleet.add(thing3);
    thing3.complete();

//    fleet = new ArrayList<>();
//    Thing things = new Thing();
//
//    things.add(new Thing("Remove the obstacles"));
//    things.add(new Thing("Stand up"));
//    things.add(new Thing("Eat lunch"));


    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}