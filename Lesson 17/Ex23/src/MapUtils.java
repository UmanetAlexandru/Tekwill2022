import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        Integer firstKey = map.firstKey();
        SortedMap<Integer, String> subMap;
        if (firstKey % 2 != 0) {
            subMap = map.subMap(firstKey, firstKey + 5);
        } else {
            Integer lastKey = map.lastKey();
            subMap = map.tailMap(lastKey - 4);
        }
        return new TreeMap<>(subMap).descendingMap();
    }
}

