public class Main {

    public static void main(String[] args) {
        for (DangerLevel value : DangerLevel.values()) {
            System.out.println(value.name() + " " + value.getLevel());
        }
    }
}
