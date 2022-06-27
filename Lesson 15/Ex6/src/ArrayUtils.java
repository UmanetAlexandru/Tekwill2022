class ArrayUtils {

    public static <T> boolean hasNull(T[] t) {
        for (T t1 : t) {
            if (t1 == null) {
                return true;
            }
        }
        return false;
    }
}