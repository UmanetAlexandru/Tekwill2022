import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> strings = new ArrayList<>(List.of(array));
        ListIterator<String> iterator = strings.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!next.startsWith("J")) {
                iterator.remove();
            } else {
                iterator.set(next.substring(1));
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}