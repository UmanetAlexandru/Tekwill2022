public class Rectangle extends Shape {
    private final double height;
    private final double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    double getPerimeter() {
        return (height + length) * 2;
    }

    @Override
    double getArea() {
        return height * length;
    }
}
