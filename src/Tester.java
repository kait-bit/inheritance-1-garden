public class Tester {
    public static void main(String[] args) {
        FruitPatch f = new FruitPatch("strawberries");
        System.out.println(f.water());

        VegPatch v = new VegPatch("carrots");
        System.out.println(v.water());
        System.out.println(v.shooRabbit());
    }
}
