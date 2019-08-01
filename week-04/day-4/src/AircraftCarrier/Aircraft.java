package AircraftCarrier;

public class Aircraft {

  public int ammunition;
  public int baseDamage;
  public int maxAmmo;
  public String type;
  public int damageDealt;


  public Aircraft(){
    this.ammunition = 0;
  }

  public int fight() {
    damageDealt =  baseDamage * ammunition;
    ammunition = 0;
    return damageDealt;
  }

  public int refill(int number) {
    if ( number >= maxAmmo && ammunition == 0) {
      ammunition += maxAmmo;
      number -= maxAmmo;
    }
    return number;
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
