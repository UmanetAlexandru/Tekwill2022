import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = Integer.parseInt(sc.nextLine());

        LocalDateTime latest = LocalDateTime.parse(sc.nextLine());

        for (int i = 1; i < nr; i++) {
            LocalDateTime newDate = LocalDateTime.parse(sc.nextLine());
            if (newDate.isAfter(latest) ) {
                latest = newDate;
            }
        }

        System.out.println(latest);
    }
}