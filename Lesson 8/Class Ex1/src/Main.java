import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        long result = sumInRange(begin, end);

        System.out.println(result);
    }

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }
}
