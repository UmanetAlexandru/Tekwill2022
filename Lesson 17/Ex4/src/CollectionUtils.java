import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        return numbers.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
