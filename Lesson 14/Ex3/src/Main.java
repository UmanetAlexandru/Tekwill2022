public class Main {

    public static void main(String[] args) {
        Shape r = new Rectangle(5.66, 21.12);
        Shape t = new Triangle(2.66, 11.42, 12);
        Shape c = new Circle(6.666);

        Shape[] arr = {r, t, c};

        for (Shape shape : arr) {
            System.out.println(shape.getClass() + " area is: " + shape.getArea());
            System.out.println(shape.getClass() + " perimeter is: " + shape.getPerimeter());
        }
    }
}
