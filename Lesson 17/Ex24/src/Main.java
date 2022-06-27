import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static final Map<Character, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next().toLowerCase();
        for (char ch : word1.toCharArray()) {
            MAP.put(ch, MAP.getOrDefault(ch, 0) + 1);
        }

        String word2 = scanner.next().toLowerCase();
        if (word1.length() != word2.length()) {
            System.out.println("no");
            return;
        }

        for (char ch : word2.toCharArray()) {
            if (MAP.containsKey(ch)) {
                Integer val = MAP.get(ch);
                if (val > 0) {
                    MAP.put(ch, val - 1);
                } else {
                    System.out.println("no");
                    return;
                }
            } else {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
