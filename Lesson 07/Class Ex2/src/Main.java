import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    int start = sc.nextInt();
    int end = sc.nextInt();

    System.out.println(st.substring(start, end + 1));
  }
}
