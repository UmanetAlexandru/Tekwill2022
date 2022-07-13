public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        int x2 = topRightCorner.getX() - width;
        int y2 = topRightCorner.getY() - height;
        Point bottomRightCorner = new Point(topRightCorner.getX(), y2);
        Point bottomLeftCorner = new Point(x2, y2);
        Point topLeftCorner = new Point(x2, topRightCorner.getY());

        vertices = new Point[]{topLeftCorner, topRightCorner, bottomRightCorner, bottomLeftCorner};
    }

}
