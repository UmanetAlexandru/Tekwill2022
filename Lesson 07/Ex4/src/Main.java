import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unformattedDate = sc.nextLine();

        String[] dateArray = unformattedDate.split("-");
        String formattedDate = dateArray[1] + "/" + dateArray[2] + "/" + dateArray[0];
        System.out.println(formattedDate);
    }
}
