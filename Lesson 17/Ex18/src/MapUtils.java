import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();
        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}