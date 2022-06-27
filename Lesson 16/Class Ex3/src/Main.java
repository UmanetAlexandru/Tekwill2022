import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> reverse = str -> new StringBuilder(str).reverse().toString();

        System.out.println(reverse.apply("String"));
        System.out.println(reverse.apply("Alexandru"));
    }
}