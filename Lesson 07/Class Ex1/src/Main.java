import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }
}
