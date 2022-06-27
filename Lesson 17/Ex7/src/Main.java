import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> list = new ArrayList<>(List.of(s.split(" ")));

        List<String> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i += 2) {
            result.add(list.get(i));
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
    }
}