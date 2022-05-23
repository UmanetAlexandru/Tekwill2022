import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String params = url.substring(url.indexOf('?') + 1);

        String[] keyValues = params.split("&");

        String output = "";
        for (String keyValue : keyValues) {
            String[] split = keyValue.split("=");
            String key = split[0];
            String value = split.length > 1 ? split[1] : "not found";
            System.out.println(key + " : " + value);
            if (key.equals("pass")) {
                output = "password : " + value;
            }
        }
        System.out.println(output);
    }
}