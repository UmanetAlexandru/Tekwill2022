import java.util.Scanner;

public class Main {

    /**
     * Prints a {@link String} reversed.
     * 
     * @param s the String to print.
     */
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.print(s.charAt(last));
            printReverseCharByChar(s.substring(0, last));
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}