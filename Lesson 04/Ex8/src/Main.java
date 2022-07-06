import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int j = scanner.nextInt();
    int x = scanner.nextInt();

    System.out.println(i != j && i != x && x != j);
  }
}
