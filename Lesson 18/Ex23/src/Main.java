import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.next());
        int days = sc.nextInt();

        LocalDate newYearDate = date.plusDays(days);
        System.out.println(date.getYear() < newYearDate.getYear());
    }
}