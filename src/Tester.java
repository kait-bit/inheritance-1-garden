import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Garden> g = new ArrayList<>();

        FruitPatch f = new FruitPatch(20, "strawberries");
        VegPatch v = new VegPatch(10, "carrots");
        VegPatch v2 = new VegPatch(5, "broccoli");

        g.add(f);
        g.add(v);
        g.add(v2);

        int totalPlants = 0;

        for (Garden garden : g) {
            totalPlants += garden.numPlants();
            System.out.println(garden.water());
            System.out.println(garden.toString());
        }

        System.out.println("Total plants in all of your gardens: " + totalPlants);
    }
}
