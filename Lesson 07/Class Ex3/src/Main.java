import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        String longestWord = strArray[0];
        for (String word : strArray) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}
