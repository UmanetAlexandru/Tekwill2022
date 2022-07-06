import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = String.valueOf(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == str.charAt(i)) {
                count++;
            } else {
                res += count + String.valueOf(str.charAt(i));
                count = 1;
            }
        }
        res += count;
        System.out.println(res);
    }
}
