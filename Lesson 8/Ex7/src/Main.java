import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Sorts the specified array into ascending numerical order.
     *
     * @param numbers the array of int to be sorted
     */
    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

//    public static void sort(int[] numbers) {
//        int temp;
//        for (int i = numbers.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
