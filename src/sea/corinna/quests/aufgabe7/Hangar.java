package sea.corinna.quests.aufgabe7;

public class Hangar {
    public static void main(String[] args) {
        Vehicle hubert = new Car ("Hubert", 30000);
        Vehicle bmwuppti = new Car ("BMWuppti", 175000);
        Vehicle fischi = new Boat ("Fischi", 500);
        Vehicle flunder = new Boat ("Die Seeflunder", 12000);

        System.out.println(hubert.doStuff());
        System.out.println(bmwuppti.doStuff());
        System.out.println(fischi.doStuff());
        System.out.println(flunder.doStuff());

    }
}
