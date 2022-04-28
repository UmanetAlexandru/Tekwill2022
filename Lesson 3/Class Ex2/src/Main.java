public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f = 2_147_483_647.2_147_483_647F;
        double d = 9_223_372_036_854_775_807.9_223_372_036_854_775_807;
        char c = 'π';
        boolean bool = true;

        //this was not mandatory
        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("boolean bool = " + bool);
    }
}
