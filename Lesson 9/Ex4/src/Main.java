public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        java.util.Scanner sc = new java.util.Scanner(System.in);

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();


        java.util.Arrays.sort(arr);

        int result = java.util.Arrays.binarySearch(arr, search);

        System.out.println(result);
    }
}
