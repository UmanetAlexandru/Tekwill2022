import java.util.Scanner;
public class Main {

    /**
     * Computes sum of all positive numbers up to a given one.
     * In case the number is negative it returns it.
     *
     * @param s the limit of sum.
     * @return sum of all numbers up to the given one.
     */
    public static long sum(int s) {
        if (s <= 1) {
            return s;
        }
        return s + sum(s - 1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}