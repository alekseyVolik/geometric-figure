package geometry.figure;

public class GeometricFigureApplication {
    public static void main(String[] args) {
        Color colorO = Color.BLUE;
        Point pointO = new Point(0, 0);
        double radiusO = 2;
        Circle circleO = new Circle(colorO, pointO, radiusO);
        System.out.printf("%s Площадь равна: %.2f%n", circleO, circleO.getArea());
        circleO.doubleIncrease();
        System.out.printf("%s Площадь равна: %.2f%n", circleO, circleO.getArea());
        circleO.doubleDecrease();
        System.out.printf("%s Площадь равна: %.2f%n", circleO, circleO.getArea());
    }
}
