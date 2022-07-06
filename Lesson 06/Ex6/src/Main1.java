import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scan.next().charAt(0);
            }
        }
        String yesNO = "YES";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i + 1][j] && matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i + 1][j + 1]) {
                    yesNO = "NO";
                    break;
                }
            }
        }
        System.out.println(yesNO);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}