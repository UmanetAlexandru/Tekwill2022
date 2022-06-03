public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret e : Secret.values()) {
            if (e.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
