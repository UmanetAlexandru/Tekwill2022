public class Main {

    public static void main(String[] args) {
        Box<Cake> box1 = new Box<>();
        box1.put(new Cake());

        Cake c1 = box1.get();

        Box<Chocolate> box2 = new Box<>();
        box2.put(new Chocolate());

        Chocolate c2 = box2.get();
    }
}
