import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 3
        int k = scanner.nextInt(); // 14
        System.out.println(k % n); // 2
    }
}