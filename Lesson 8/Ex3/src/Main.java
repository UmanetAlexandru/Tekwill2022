import java.util.Scanner;

public class Main {

    /**
     * Returns n!. Shorthand for n Factorial, the product of the numbers 1,...,n.
     *
     * @param n - argument
     * @return n!
     */
    public static long factorial(long n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

//    public static long factorial(long n) {
//        return n <= 1 ? 1 : n * factorial(n - 1);
//    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
