import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        StringBuilder sb = new StringBuilder(next);
        int i = next.length() / 2;
        sb.deleteCharAt(i);
        if (next.length() % 2 == 0) {
            sb.deleteCharAt(i - 1);
        }
        System.out.println(sb);
    }
}