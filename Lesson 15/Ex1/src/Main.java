public class Main {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        ComplexNumber c = new ComplexNumber(1, 2);

        // a.equals(b) must return true
        // a.hashCode() must be equal to b.hashCode()

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println(a.equals(c));
        System.out.println(a.hashCode() == c.hashCode());

        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
    }
}
