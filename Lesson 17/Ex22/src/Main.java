import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static final Map<String, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newspaper = scanner.nextLine();
        String[] newspaperWords = newspaper.split(" ");

        for (String newspaperWord : newspaperWords) {
            MAP.put(newspaperWord, MAP.getOrDefault(newspaperWord, 0) + 1);
        }

        String phrase = scanner.nextLine();
        if (hasAllWords(phrase)) {
            System.out.println("You get money");
        } else {
            System.out.println("You are busted");
        }

    }

    public static boolean hasAllWords(String phrase) {
        for (String s : phrase.split(" ")) {
            if (MAP.containsKey(s)) {
                Integer count = MAP.get(s);
                if (count == 0) {
                    return false;
                }
                MAP.put(s, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}