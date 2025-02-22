public class FruitPatch implements Garden {
    private int numPlants;
    private final String fruit;
    private Boolean ripeness;

    public FruitPatch(int numPlants, String fruit) {
        this.numPlants = numPlants;
        this.fruit = fruit;
        this.ripeness = false;
    }

    @Override public int numPlants() {
        return numPlants;
    }

    public Boolean getRipeness() {
        return ripeness;
    }

    public String getFruit() {
        return fruit;
    }

    @Override public String water() {
        ripeness = true;
        return "You water " + numPlants + " " + fruit + ".";
    }
}
