import java.util.HashSet;
import java.util.Set;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        String[] s = str.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String value : s) {
            set.add(Integer.parseInt(value));
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(x -> x > 10);
    }

}