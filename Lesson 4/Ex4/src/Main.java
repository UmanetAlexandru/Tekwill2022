import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int up = scanner.nextInt();
    int down = scanner.nextInt();

//	double heightToClimb = height - down;
//	double climbPerDay = up - down;
//	int result = (int) Math.ceil(heightToClimb / climbPerDay);


    int heightToClimb = height - down;
    int climbPerDay = up - down;

    //q = (x + y - 1) / y;
    int result = (heightToClimb + climbPerDay - 1)  / climbPerDay;

    System.out.println(result);
  }
}
