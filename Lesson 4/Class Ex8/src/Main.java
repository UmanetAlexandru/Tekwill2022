import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(); // 2
        double b = scanner.nextDouble(); // -1
        double c = scanner.nextDouble(); // 2

        //a * x + b = c;
        //a * x = c - b;
        //x = (c - b) / a;
        System.out.println((c - b) / a);
    }
}