package sea.corinna.quests.aufgabe7;

public class Car extends Vehicle{

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

   @Override
    public String doStuff() {
        return "I am " + getBrand() + " and I go zoom zoom zoom!";
    }
}
