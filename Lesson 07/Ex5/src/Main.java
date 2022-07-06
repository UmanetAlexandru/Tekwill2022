import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String st = sc.nextLine();

        int count = 0;
        int pos = 0;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == st.charAt(pos)) {
                pos++;
                if (pos == st.length()) {
                    count++;
                    pos = 0;
                }
            }
            else {
                pos = 0;
            }
        }
        System.out.println(count);
    }
}