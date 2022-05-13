import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int in;
        do {
            in = sc.nextInt();
            if (in != 0) {
                count++;
            }
        } while (in != 0);

        System.out.println(count);
    }
}
//1 7 9  2 4 5  6 7 0  5 12 3 512 232 32 0