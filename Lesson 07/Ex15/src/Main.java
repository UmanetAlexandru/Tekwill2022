import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int n = scanner.nextInt();

        for (int i = n; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }

        if (n > word.length()) {
            System.out.println(word);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(word.charAt(i));
            }
        }
    }
}