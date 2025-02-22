public class FruitPatch implements Garden {
    private int numPlants;
    private Boolean ripeness;
    private final String fruit;

    public FruitPatch(int numPlants, String fruit) {
        this.numPlants = numPlants;
        this.ripeness = false;
        this.fruit = fruit;
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
