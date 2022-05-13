import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfElements = scanner.nextInt();
        long max = 0;

        for (int i = 0; i < nrOfElements; i++) {
            int nr = scanner.nextInt();
            if (nr % 4 == 0 && nr > max) {
                max = nr;
            }
        }

        System.out.println(max);
    }
}