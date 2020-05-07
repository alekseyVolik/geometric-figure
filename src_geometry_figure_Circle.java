package geometry.figure;

public class Circle extends GeometricFigure implements Transformation{

    private Point center;
    private double radius;

    public Circle(Color color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void doubleIncrease() {
        radius *= 2;
    }

    @Override
    public void doubleDecrease() {
        radius /= 2;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius + ", центр в точке: " + center + ".";
    }
}
