import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> sup1 = FunctionUtils.getInfiniteRange();

        Supplier<Integer> sup2 = FunctionUtils.getInfiniteRange();
        for(int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }
}
