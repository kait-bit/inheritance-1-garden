public class Tester {
    public static void main(String[] args) {
        FruitPatch f = new FruitPatch(20, "strawberries");
        System.out.println(f.water());

        VegPatch v = new VegPatch(10, "carrots");
        System.out.println(v.water());
        System.out.println(v.shooRabbit());
    }
}
