import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int remainingDays = scanner.nextInt() - 1;

        LocalDate date = LocalDate.of(year, month, 1);

        int length = date.lengthOfMonth();
        LocalDate localDate = date.withDayOfMonth(length).minusDays(remainingDays);
        System.out.println(localDate);


    }
}