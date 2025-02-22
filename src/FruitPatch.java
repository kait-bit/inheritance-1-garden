public class FruitPatch implements Garden {
    private Boolean ripeness;
    private final String fruit;

    public FruitPatch(String fruit) {
        this.ripeness = false;
        this.fruit = fruit;
    }

    public Boolean getRipeness() {
        return ripeness;
    }

    public String getFruit() {
        return fruit;
    }

    @Override public String water() {
        ripeness = true;
        return "You water the " + fruit + ".";
    }
}
