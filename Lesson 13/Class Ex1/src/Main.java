import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");

        long id = Long.parseLong(parts[0]);

        String code = parts[1];
        long balance = Long.parseLong(parts[2]);
        Object acc = new Account(id, code, balance);

        System.out.println(acc);
    }
}
