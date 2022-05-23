import java.util.Scanner;

public class Main {

    /**
     * Extracts the integer part of the given double value.
     * 
     * @param d the double value
     * @return the integer part
     */
    public static int extractInt(double d) {
        return (int) d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}
