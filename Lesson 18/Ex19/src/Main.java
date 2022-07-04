import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        int minutes = scanner.nextInt();

        dateTime = dateTime.plusMinutes(minutes);


        System.out.printf("%d %d %s", dateTime.getYear(), dateTime.getDayOfYear(), dateTime.toLocalTime());
    }
}