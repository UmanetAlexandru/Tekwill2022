import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateX = LocalDate.parse(scanner.next());
        LocalDate dateN = LocalDate.parse(scanner.next());
        LocalDate dateM = LocalDate.parse(scanner.next());


        boolean date = dateX.isAfter(dateN) && dateX.isBefore(dateM) ||
                       dateX.isAfter(dateM) && dateX.isBefore(dateN);

        System.out.println(date);
    }
}