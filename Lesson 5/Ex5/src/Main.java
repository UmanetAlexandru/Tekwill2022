import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double a, b, c;

        switch (type) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double s = (a + b + c) / 2;
                double x = s * (s - a) * (s - b) * (s - c);
                System.out.println(Math.sqrt(x));
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = sc.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                System.out.println("Figure " + type + " is not yet supported!");
        }
    }
}
