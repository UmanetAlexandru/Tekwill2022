public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("double d = " + d);
        System.out.println();

        double hugeDecimalNumber = 9_223_036_775_800.9_223_372_036;
        float smallerDecimalNumber = (float) hugeDecimalNumber;
        long giantIntegerNumber = (long) smallerDecimalNumber;
        int hugeIntegerNumber = (int) giantIntegerNumber;
        short smallerIntegerNumber = (short) hugeIntegerNumber;
        byte smallestIntegerNumber = (byte) smallerIntegerNumber;
        char character = (char) smallestIntegerNumber;

        //this was not mandatory
        System.out.println("double hugeDecimalNumber = " + hugeDecimalNumber);
        System.out.println("float smallerDecimalNumber = " + smallerDecimalNumber);
        System.out.println("long giantIntegerNumber = " + giantIntegerNumber);
        System.out.println("int hugeIntegerNumber = " + hugeIntegerNumber);
        System.out.println("short smallerIntegerNumber = " + smallerIntegerNumber);
        System.out.println("byte smallestIntegerNumber = " + smallestIntegerNumber);
        System.out.println("char character = " + character);
    }
}
