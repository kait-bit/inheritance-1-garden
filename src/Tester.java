import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Garden> g = new ArrayList<Garden>();

        FruitPatch f = new FruitPatch(20, "strawberries");
        System.out.println(f.water());
        System.out.println(f.toString());

        VegPatch v = new VegPatch(10, "carrots");
        System.out.println(v.water());
        System.out.println(v.toString());

        VegPatch v2 = new VegPatch(5, "broccoli");
        System.out.println(v2.water());
        System.out.println(v2.toString());

        g.add(f);
        g.add(v);
        g.add(v2);

        int totalPlants = 0;

        for (Garden garden : g) {
            totalPlants += garden.numPlants();
        }

        System.out.println("Total plants in all of your gardens: " + totalPlants);
    }
}
