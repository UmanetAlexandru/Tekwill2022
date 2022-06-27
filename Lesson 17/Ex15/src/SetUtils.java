import java.util.HashSet;
import java.util.Set;

class SetUtils {

    /**
     * @return symmetric difference between set1 and set2
     */
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>();
        for (String s : set1) {
            if (!set2.contains(s)) {
                result.add(s);
            }
        }
        for (String s : set2) {
            if (!set1.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

}
