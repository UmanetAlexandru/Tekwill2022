// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    public static <T> T getFirst(T[] arr) {
        if (arr.length < 1) {
            return null;
        }
        return arr[0];
    }
}