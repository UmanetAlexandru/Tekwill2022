import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        boolean ordered = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) - str.charAt(i - 1) != 1) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);


    }
}