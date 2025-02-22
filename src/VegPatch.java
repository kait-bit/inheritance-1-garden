public record VegPatch(int numPlants, String veg) implements Garden {
    @Override public String water() {
        return "You water " + numPlants + " " + veg + ".";
    }
}
