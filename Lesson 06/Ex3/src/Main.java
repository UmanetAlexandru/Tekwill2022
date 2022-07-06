import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        long sum = 0;
        for (int x : arr) {
            if (x > n) {
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
