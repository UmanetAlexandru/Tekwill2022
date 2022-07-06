import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();//8
      int b = sc.nextInt();//10
      int h = sc.nextInt();

      if (h >= a && h <= b) {
        System.out.println("Normal");
      } else if (h < a) {
        System.out.println("Deficiency");
      } else {
        System.out.println("Excess");
      }
  }
}