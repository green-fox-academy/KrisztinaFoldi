package AircraftCarrier;

public class BattleField {
  public static void main(String[] args) {
    F16 alfa = new F16();
    F16 bravo = new F16();
    F16 delta = new F16();
    F35 charlie = new F35();
    F35 echo = new F35();
    F35 foxtrot = new F35();
    F16 golf = new F16();

    AircraftCarrier amcsik = new AircraftCarrier(2000, 5000);
    AircraftCarrier komcsik = new AircraftCarrier(2200, 4900);

    amcsik.add(alfa);
    amcsik.aircrafts.add(echo);
    amcsik.aircrafts.add(foxtrot);
    amcsik.aircrafts.add(charlie);
    komcsik.aircrafts.add(bravo);
    komcsik.aircrafts.add(delta);
    komcsik.aircrafts.add(golf);

    amcsik.fill();
    komcsik.fill();

    amcsik.fightWithEachother(komcsik);
    amcsik.fill();
    amcsik.fightWithEachother(komcsik);
    komcsik.fill();
    komcsik.fightWithEachother(amcsik);
    amcsik.fill();
    amcsik.fightWithEachother(komcsik);
    komcsik.fill();
    amcsik.fill();

    System.out.println(amcsik.getStatus());
    System.out.println(komcsik.getStatus());

  }
}
