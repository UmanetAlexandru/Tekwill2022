public class Main {

    public static void main(String[] args) {
        IntBinaryOperation add = new Addition(5, 6);
        IntBinaryOperation mult = new Multiplication(5, 6);

        IntBinaryOperation[] arr = {add, mult};

        for (IntBinaryOperation var : arr) {
            int p = var.perform();
            System.out.println(p);
        }
    }
}
