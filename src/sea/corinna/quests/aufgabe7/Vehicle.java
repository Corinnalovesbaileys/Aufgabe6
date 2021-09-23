package sea.corinna.quests.aufgabe7;

public abstract class Vehicle {
    //Attribute
    private String brand;
    private int kilometers;

    //constructor:
    public Vehicle(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters:
    public String getBrand(){return this.brand;}
    public int getKilometers(){return this.kilometers;}

    //setters:
    public void setBrand(String brand) {this.brand = brand;}
    public void setKilometers(int kilometers){this.kilometers = kilometers;}

    //7) abstrakte Methode
    public abstract String doStuff();

}
