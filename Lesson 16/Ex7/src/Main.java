public class Main {
    public static void main(String[] args) {
        System.out.println(Predicate.ALL_DIFFERENT.test(1, 2, 3));
        System.out.println(Predicate.ALL_DIFFERENT.test(1, 2, 1));
        System.out.println(Predicate.ALL_DIFFERENT.test(2, 1, 1));
    }
}
