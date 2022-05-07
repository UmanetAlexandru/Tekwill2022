import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();//4136

        // 4136 / 100 = 41
        // 41 * 100 = 4100
        int temp = (nr / 100) * 100; // 4100

        // = (4136 - 4100) / 10 = 36 / 10 = 3
        System.out.println((nr - temp) / 10 );
    }
}