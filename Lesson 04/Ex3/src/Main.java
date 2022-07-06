import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();

    int i1 = i / 100;
    int i2 = (i % 100) / 10;
    int i3 = i % 10;
    int res = i1 + i2 + i3;
    System.out.println(res);
  }
}
