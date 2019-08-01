package AircraftCarrier;
import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {

  List<Aircraft> aircrafts = new ArrayList<>();
  int ammoStored;
  int healthPoint;

  public AircraftCarrier(int ammoStored, int healthPoint) {
    this.ammoStored = ammoStored;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    try {
      for (int i = 0; i < aircrafts.size() ; i++) {
        if (aircrafts.get(i).isPriority() && ammoStored >= aircrafts.get(i).maxAmmo) {
          aircrafts.get(i).refill(ammoStored);
          ammoStored -= aircrafts.get(i).maxAmmo;
        }
      }
      for (int i = 0; i < aircrafts.size() ; i++) {
        if ( !aircrafts.get(i).isPriority() && ammoStored >= aircrafts.get(i).maxAmmo) {
          aircrafts.get(i).refill(ammoStored);
          ammoStored -= aircrafts.get(i).maxAmmo;
        }
      }
    } catch (Exception e) {
      System.out.println("There is not enough ammunition to refill!");
    }
  }

  public void fightWithEachother(AircraftCarrier otherAircraftCarrier) {
    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).fight();
      otherAircraftCarrier.healthPoint -= aircrafts.get(i).damageDealt;
    }
  }

  public String getStatus() {
    String status;
    if (healthPoint <= 0 ) {
      status = "It's dead Jim :( ";
    } else {
      status = "HP: " + healthPoint + " , Aircraft count: "
              + aircrafts.size() + " , Ammo Storage: " + ammoStored + " , Total damage: \n" + "Aircrafts: \n";
      for (int i = 0; i < aircrafts.size(); i++) {
        status += aircrafts.get(i).getStatus() + "\n";
      }
    }
    return status;
  }

}
