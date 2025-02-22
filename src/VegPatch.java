public record VegPatch(String veg) implements Garden {
    @Override public String water() {
        return "You water the " + veg + ".";
    }

    public String shooRabbit() {
        if (veg.equals("carrots") || veg.equals("Carrots")) {
            return "The rabbit steals a carrot!";
        } else {
            return "You successfully shoo away the rabbit.";
        }
    }
}
