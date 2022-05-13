import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dir = sc.nextInt();

    String st = "move ";
    switch (dir) {
      case 1:
        st += "up";
        break;
      case 2:
        st += "down";
        break;
      case 3:
        st += "left";
        break;
      case 4:
        st += "right";
        break;
      case 0:
        st = "do not move";
        break;
      default:
        st = "error!";
    }

    System.out.println(st);
  }
}
