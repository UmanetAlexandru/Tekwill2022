import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    boolean result = i < 10 && i > 0;
    System.out.println(result);
  }
}
