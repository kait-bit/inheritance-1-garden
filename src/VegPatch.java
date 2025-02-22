public record VegPatch(int numPlants, String veg) implements Garden {
    @Override public String water() {
        return "You successfully water the " + veg + ".";
    }

    @Override public String toString() {
        return "Your garden has " + numPlants + " " + veg + ".";
    }
}
