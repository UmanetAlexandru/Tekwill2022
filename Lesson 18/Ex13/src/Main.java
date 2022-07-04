import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        LocalTime time2 = LocalTime.parse(scanner.nextLine());

        int seconds1 = time1.toSecondOfDay();
        int seconds2 = time2.toSecondOfDay();

        System.out.println(Math.abs(seconds1 - seconds2));
    }
}