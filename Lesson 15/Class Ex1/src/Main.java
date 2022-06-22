public class Main {

    public static void main(String[] args) {
        Money m1 = new Money(1000, "$");
        Money m2 = new Money(1000, "$");
        Money m3 = new Money(100, "€");

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m2.equals(m3));
        System.out.println(m1.equals(m1));

        System.out.println("----------------");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

    }
}
