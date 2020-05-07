package geometry.figure;

public abstract class GeometricFigure {

    private Color color;

    public GeometricFigure(Color color) {
        this.color = color;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();

}
