public class Main {

    public static void main(String[] args) {
        Vehicle truck = new Car("ABC125", 3);
        print(truck);
    }

    public static void print(Vehicle car) {
        System.out.println(car.toString());
    }
}
