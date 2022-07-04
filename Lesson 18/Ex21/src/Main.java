import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(scanner.next());
        LocalTime time2 = LocalTime.parse(scanner.next());

        LocalTime time3 = LocalTime.parse(scanner.next());
        LocalTime time4 = LocalTime.parse(scanner.next());

        boolean intersects = !time4.isBefore(time1) && !time3.isAfter(time2);
        System.out.println(intersects);

    }
}