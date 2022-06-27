import java.util.function.LongUnaryOperator;

class Operator {
    public static LongUnaryOperator unaryOperator = x -> x += x % 2 == 0 ? 2 : 1;
}