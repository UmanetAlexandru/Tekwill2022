import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        boolean r1 = a + b == 20;
        boolean r2 = a + c == 20;
        boolean r3 = b + c == 20;
        boolean result = r1 || r2 || r3;
        System.out.println(result);

//        System.out.println(a + b == 20 || a + c == 20 || b + c == 20);
    }
}
