import java.util.Scanner;

public class Main {

    /**
     * Returns the value of the first argument raised to the power of the second argument.
     *
     * @param a the base.
     * @param n the exponent.
     * @return the value {@code a}<sup>{@code n}</sup>.
     */
    public static double power(double a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return power(a * a, n / 2);
        } else {
            return a * power(a, n - 1);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = scanner.nextDouble();
        final int n = scanner.nextInt();
        System.out.println(power(a, n));
    }
}