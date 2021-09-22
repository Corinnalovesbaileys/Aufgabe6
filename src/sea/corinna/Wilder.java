package sea.corinna;

public class Wilder {
    private String firstname;
    private boolean present;

    //constructors:
    public Wilder (String firstname) {
        this.firstname = firstname;
        this.present = false;
    }

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    //getters:
    public String getName() {
        return this.firstname;
    }
    public boolean isPresent() {
        return this.present;
    }

    //setters:
    public void setName(String name) {
        this.firstname = name;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }

    //Methode whoAmI()
    public void whoAmI () {
        if (this.isPresent() == true) {
            System.out.println("My name is " + this.getName() + " and I am present.");
        }
            else {
            System.out.println("My name is " + this.getName() + " and I am not present.");
        }
        }
    }


