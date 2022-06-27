import java.util.List;

public class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count = 0;
        for (Integer integer : list1) {
            if(integer == elem) {
                count++;
            }
        }

        for (Integer integer : list2) {
            if(integer == elem) {
                count--;
            }
        }

        return count == 0;
    }
}