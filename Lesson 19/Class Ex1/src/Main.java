import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");

        int i = Integer.parseInt(sc.next());

        if (s.length <= i || i < 0) {
            System.out.println("No such element.");
        } else {
            System.out.println(s[i]);
        }

    }
}
