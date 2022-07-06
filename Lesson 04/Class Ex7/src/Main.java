import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();//20
        int g2 = scanner.nextInt();//21
        int g3 = scanner.nextInt();//22

        int res1 = (g1 + 1) / 2; // = 21 / 2 = 10
        int res2 = (g2 + 1) / 2; // = 22 / 2 = 11
        int res3 = (g3 + 1) / 2; // = 23 / 2 = 12
        System.out.println(res1 + res2 + res3); // = 32
    }
}