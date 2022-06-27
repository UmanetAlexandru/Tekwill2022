import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        Set<String> dictionary = new TreeSet<>();
        for (int i = 0; i < d; i++) {
            dictionary.add(scanner.next().toLowerCase());
        }
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> erroneous = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine().toLowerCase();
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (!dictionary.contains(word)) {
                    erroneous.add(word);
                }
            }
        }


        for (String s : erroneous) {
            System.out.println(s);
        }
    }
}