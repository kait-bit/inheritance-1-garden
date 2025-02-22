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

    public void setNumPlants(int numPlants) {
        this.numPlants = numPlants;
    }

    @Override public String water() {
        ripeness = true;
        return "You successfully water the " + fruit + ".";
    }

    @Override public String toString() {
        if (ripeness) {
            return "Your " + numPlants + " " + fruit + " are ripe!";
        } else {
            return "Your " + numPlants + " " + fruit + " are not ripe!";
        }
    }
}
