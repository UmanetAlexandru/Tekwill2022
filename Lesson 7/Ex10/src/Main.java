import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        char lChar = 'a';
        char uChar = 'A';
        int digit = 0;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < a; i++) {
            password.append(uChar);
            uChar = uChar == 'Z' ? 'A' : ++uChar;
        }
        for (int i = 0; i < b; i++) {
            password.append(lChar);
            lChar = lChar == 'z' ? 'a' : ++lChar;
        }
        for (int i = 0; i < c; i++) {
            password.append(digit);
            digit = digit == 9 ? 0 : ++digit;
        }
        while (password.length() < n) {
            password.append(uChar);
            uChar = uChar == 'Z' ? 'A' : ++uChar;
        }
        System.out.println(password);
    }
}