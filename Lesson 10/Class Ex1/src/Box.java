class Box {
    private final double height;
    private final double width;
    private final double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getVolume() {
        return height * width * length;
    }
}