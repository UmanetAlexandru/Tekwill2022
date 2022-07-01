import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        while (!input.equals("0")) {
            try {
                int number = Integer.parseInt(input);
                System.out.println(number * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
            input = scanner.nextLine().trim();
        }

    }
}