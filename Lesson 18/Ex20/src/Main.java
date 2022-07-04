import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime dt2 = LocalDateTime.parse(scanner.nextLine());

        if (dt2.isBefore(dt1)) {
            LocalDateTime temp = dt1;
            dt1 = dt2;
            dt2 = temp;
        }

        int nrOfDt = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < nrOfDt; i++) {
            LocalDateTime dt = LocalDateTime.parse(scanner.next());

            if ((dt.isAfter(dt1) || dt.equals(dt1)) && dt.isBefore(dt2)) {
                count++;
            }
        }

        System.out.println(count);
    }
}