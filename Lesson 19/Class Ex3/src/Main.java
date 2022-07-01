import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] s = sc.nextLine().split("\\s+");
            int i = Integer.parseInt(sc.next());
            System.out.println(s[i]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such element.");
        }
    }
}
