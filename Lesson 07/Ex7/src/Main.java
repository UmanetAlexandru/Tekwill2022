import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str.toLowerCase().startsWith("j"));
//        System.out.println(str.toLowerCase().charAt(0) == 'j');

    }
}