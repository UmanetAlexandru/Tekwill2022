import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

public class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        AtomicInteger i = new AtomicInteger();
        return i::getAndIncrement;
    }
}
