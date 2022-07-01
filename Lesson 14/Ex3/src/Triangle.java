public class Triangle extends Shape {
    private final double x;
    private final double y;
    private final double z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    double getPerimeter() {
        return x + y + z;
    }

    @Override
    double getArea() {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}
