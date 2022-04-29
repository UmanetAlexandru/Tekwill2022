import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?"); // not mandatory line
        String name = scanner.nextLine();
        System.out.println("What is your age?"); // not mandatory line
        int age = scanner.nextInt();

        System.out.println("Hi, my name is " + name + "!");
        System.out.println("I'm " + age + " years old!");
    }
}
