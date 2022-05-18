import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        st1 = st1.replace(" ", "").trim();
        st2 = st2.replace(" ", "").trim();

        System.out.println(st1.equals(st2));
    }
}
