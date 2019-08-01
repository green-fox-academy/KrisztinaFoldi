package AircraftCarrier;

import java.util.List;

public class AircraftCarrier {

  List<Aircraft> aircrafts;
  int initialAmmo;
  int healthPoint;

  public AircraftCarrier(int initialAmmo, int healthPoint) {
    this.initialAmmo = initialAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    try {
      for (int i = 0; i < aircrafts.size() ; i++) {

      }

    } catch (Exception e) {

    }
  }
}
