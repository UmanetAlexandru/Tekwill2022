import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "Four"};
        Integer[] ints = {1, 2, 3, 4, 5};

        ArrayUtils.invert(strings);
        ArrayUtils.invert(ints);

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}