class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0 || Double.isNaN(radius)) {
            throw new IllegalArgumentException("Radius cannot be negative, zero, or NaN");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}