public class Rectangle extends Shape {
  private double height;
  private double length;

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
