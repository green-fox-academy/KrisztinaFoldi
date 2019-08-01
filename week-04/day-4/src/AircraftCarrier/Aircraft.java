package AircraftCarrier;

public class Aircraft {

  public int ammunition;
  public int baseDamage;
  public int maxAmmo;
  public String type;


  public Aircraft(){
    this.ammunition = 0;
  }

  public int fight() {
    int damageDealt =  baseDamage * ammunition;
    ammunition = 0;
    return damageDealt;
  }

  public int refill(int number) {
    int remainingAmmo = number - maxAmmo;
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + " , Ammo: " + ammunition + " , Base Damage: " + baseDamage + " , All Damage: " + ammunition * baseDamage;
  }

  public boolean isPriority() {
    if ( type.equals("F35")) {
      return true;
    }
    return false;
  }
}
