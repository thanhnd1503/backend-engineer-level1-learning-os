class Rectangle implements IShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0 || Double.isNaN(width) || Double.isNaN(height)) {
            throw new IllegalArgumentException("Width and height cannot be negative, zero, or NaN");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}