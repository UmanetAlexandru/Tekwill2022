import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getMonth().getValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}