import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genome = scanner.nextLine().toLowerCase();

        String[] chars = genome.split("");
        double count = 0.0;
        for (String ch : chars) {
            if (ch.equals("g") || ch.equals("c")) {
                count++;
            }
        }
        double result = count / chars.length * 100;

        System.out.println(result);
    }
}