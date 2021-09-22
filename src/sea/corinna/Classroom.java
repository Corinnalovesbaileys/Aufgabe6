package sea.corinna;

public class Classroom {
    public static void main(String[] args) {

        Wilder N1 = new Wilder ("Corinna", true);
        Wilder N2 = new Wilder ("Donald", false);
        Wilder N3 = new Wilder ("Berta", true);
        N1.whoAmI();
        N2.whoAmI();
        N3.whoAmI();
    }
}
