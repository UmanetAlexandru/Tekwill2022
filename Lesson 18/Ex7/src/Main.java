import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        int length = firstDay.lengthOfMonth();
        LocalDate lastDay = firstDay.withDayOfMonth(length);

        System.out.println(firstDay + " " + lastDay);

    }
}