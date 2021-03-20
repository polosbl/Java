package Lesson5.Classwork2;

public abstract class GeometricalFigure {
    private Point center;

    public GeometricalFigure(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public abstract String getFigureType();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean containsPoint(Point point);

    public abstract void printInformation();

}
