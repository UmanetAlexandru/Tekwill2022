import java.util.*;

public class Main {

    /**
     * The method take an array of longs and add value to the specified element by its index.
     *
     * @param array an array of longs
     * @param index the index of an element
     * @param value a value for adding
     */
    public static void addValueByIndex(long[] array, int index, long value) {
        array[index] += value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
