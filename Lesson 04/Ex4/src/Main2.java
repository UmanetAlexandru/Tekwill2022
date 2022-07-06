import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter height H:");
    int H = scanner.nextInt();
    System.out.println("Enter the number of feet up daily A:");
    int A = scanner.nextInt();
    System.out.println("Enter the number of feet down per night B:");
    int B = scanner.nextInt();

    int feetUntilTheLastDay = H - A;
    int feetPerDay = A - B;

    int dayReach = feetUntilTheLastDay / feetPerDay + 1;

    boolean rest = (feetUntilTheLastDay % feetPerDay > 0);

    int restInt = rest ? 1 : 0;

    dayReach+=restInt;

    System.out.println(dayReach);
  }
}
