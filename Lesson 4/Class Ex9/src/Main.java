import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        boolean b1 = i1 <= i2 && i1 >= i3;
        boolean b2 = i1 <= i3 && i1 >= i2;
        System.out.println(b1 || b2);
    }
}