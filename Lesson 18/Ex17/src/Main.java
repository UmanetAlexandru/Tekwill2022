import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());

        int days = (dateTime.getDayOfYear() - 1) * 24;
        int hours = dateTime.getHour();

        System.out.println(days + hours);

    }
}