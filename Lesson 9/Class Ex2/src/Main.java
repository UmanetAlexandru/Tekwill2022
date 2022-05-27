public class Main {

    public static void main(String[] args) {
        String sc = getString();
        System.out.println(sc);
    }

    public static String getString() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        return sc.nextLine();
    }
}
