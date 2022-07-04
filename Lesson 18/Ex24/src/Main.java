import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LocalTime offTime = LocalTime.of(20, 0);

        Scanner sc = new Scanner(System.in);
        int numberOfStores = Integer.parseInt(sc.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfStores; i++) {
            String token = sc.nextLine();

            String[] arr = token.split(" ");

            LocalTime time = LocalTime.parse(arr[1].trim());

            if (time.isAfter(offTime)) {
                list.add(arr[0]);
            }
        }

        for (String store : list) {
            System.out.println(store);
        }
    }
}