import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d == 0) {
            System.out.println("Division by zero!");
            return;
        }
        int intermediate = (b + c) / d;
        if (intermediate == 0) {
            System.out.println("Division by zero!");
            return;
        }
        int result = a / intermediate;

        System.out.println(result);
    }
}