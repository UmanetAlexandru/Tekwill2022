import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ourDayStr = sc.nextLine().toUpperCase();

        DayOfWeek ourDay = DayOfWeek.valueOf(ourDayStr);
        System.out.println(ourDay);


        switch (ourDay) {
            case FRIDAY:
                System.out.println("It's friday dude!");
                break;
            case MONDAY:
                System.out.println("It's time to go to work!");
                break;
            default:
                System.out.println("Ordinary day!");
        }
    }
}
