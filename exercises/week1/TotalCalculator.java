import java.util.List;

class TotalCalculator {
    public static double totalArea(List<IShape> shapes) {
        if (shapes == null) {
            throw new NullPointerException("Shapes list cannot be null");
        }
        double totalArea = 0;
        for (IShape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}