import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();

//        System.out.println("asd " + x * x * x + x * x + x + 1);
        // You also can use the line below
        //System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1); //using Math.pow(nr, power) method

        boolean b = sc.nextBoolean();
        sc.nextLine();
        boolean a = sc.nextBoolean();
        if (a && b || b ^ a) {
            System.out.println("TRUE");
        }
    }
}
