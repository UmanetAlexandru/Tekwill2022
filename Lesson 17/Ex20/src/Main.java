import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        Map<Integer, String> map = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            map.put(key, value);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() >= a && entry.getKey() <= b) {
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }

    }
}