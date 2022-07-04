import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long seconds = Long.parseLong(sc.nextLine());

        LocalTime localTime = LocalTime.ofSecondOfDay(seconds);

        System.out.println(localTime);
    }
}