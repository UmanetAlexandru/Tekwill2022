import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    String substring = sc.nextLine();

    String[] split = string.split(substring);
    int count = split.length - 1;

    System.out.println(count);
  }
}
