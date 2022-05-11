import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1) {
            System.out.println("no army");
        } else if (a <= 19) {
            System.out.println("pack");
        } else if (a <= 249) {
            System.out.println("throng");
        } else if (a <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
