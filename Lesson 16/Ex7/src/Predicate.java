public class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (i1, i2, i3) -> i1 != i2 &&
                                                                            i2 != i3 &&
                                                                            i1 != i3;
}