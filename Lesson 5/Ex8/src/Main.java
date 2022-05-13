import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();//1
    int e = sc.nextInt();//3

    long res = 1;
    for (int i = b; i < e; i++) {
      res *= i;
    }
    System.out.println(res);
  }
}
