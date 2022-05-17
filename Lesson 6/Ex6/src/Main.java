import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        String prity = "YES";

        for (int i = 1; i < 4; i++) {
            String l1 = arr[i - 1];
            String l2 = arr[i];
            for (int j = 1; j < 4; j++) {
                if (l1.charAt(j - 1) == l2.charAt(j - 1) && l1.charAt(j) == l2.charAt(j) && l1.charAt(j - 1) == l1.charAt(j)) {
                    prity = "NO";
                    break;
                }
            }
            if ("NO".equals(prity)) {
                break;
            }
        }
        System.out.println(prity);
    }
}

/*
WWWW
BBBB
WWWW
YYYY
 Ditto*/