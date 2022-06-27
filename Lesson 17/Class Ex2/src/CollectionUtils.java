import java.util.Collection;

public final class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist) {
        for (String blackPhone : blacklist) {
            phones.remove(blackPhone);
        }
        return phones;
    }

    private CollectionUtils() {

    }
}
