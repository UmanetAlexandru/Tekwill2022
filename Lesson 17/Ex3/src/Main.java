import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = scanner.nextInt();
        String[] strInts = line.split(" ");
        int diff = Integer.MAX_VALUE;

        List<Integer> result = new ArrayList<>();
        for (String strInt : strInts) {
            int i = Integer.parseInt(strInt);
            int tempDiff = Math.abs(n - i);
            if (diff > tempDiff) {
                result.clear();
                result.add(i);
                diff = tempDiff;
            } else if (diff == tempDiff) {
                result.add(i);
            }
        }
        result.sort(Comparator.comparingInt(o -> o));

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}