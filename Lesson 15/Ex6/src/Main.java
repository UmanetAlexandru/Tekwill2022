// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

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