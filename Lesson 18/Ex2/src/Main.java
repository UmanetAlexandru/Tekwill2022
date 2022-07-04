import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        int days = scanner.nextInt();
        LocalDate date = LocalDate.parse(str);

        int year = date.getYear();

        while (date.getYear() == year) {
            System.out.println(date);
            date = date.plusDays(days);
        }
    }
}