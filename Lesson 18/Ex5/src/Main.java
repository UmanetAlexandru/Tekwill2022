import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalDate date = LocalDate.parse(str);

        LocalDate after = date.plusYears(30);
        LocalDate before = date.minusYears(30);

        System.out.println(before);
        System.out.println(after);
    }
}