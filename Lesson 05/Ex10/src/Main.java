import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 50
        int sq = 0;// 0
        int i = 1;// 1
        while (sq < n) {
            sq = i * i;
            i++;
            if (sq <= n) {
                System.out.println(sq);
            }
        }
    }
}