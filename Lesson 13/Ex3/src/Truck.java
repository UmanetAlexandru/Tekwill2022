public class Truck extends Vehicle {
    private int tons;

    public Truck(String licensePlate, int tons) {
        super(licensePlate);
        this.tons = tons;
    }

    @Override
    public String toString() {
        return "Truck{" +
               "tons=" + tons +
               ", licensePlate='" + licensePlate + '\'' +
               '}';
    }
}
