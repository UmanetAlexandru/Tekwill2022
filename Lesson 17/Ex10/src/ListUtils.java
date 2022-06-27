import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();

        if (subListSize < list.size()) {
            sublists.add(list.subList(0, subListSize));
            sublists.add(list.subList(subListSize, list.size()));
        } else {
            sublists.add(list);
        }
        return sublists;
    }
}
