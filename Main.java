import java.util.*;

class Main {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Circle(-5));
        shapes.add(new Rectangle(4, 6));
        double totalArea = TotalCalculator.totalArea(shapes);
        System.out.println("Tong dien tich: " + totalArea);
    }
}
