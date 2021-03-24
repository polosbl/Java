package Lesson6.Classwork;

public abstract class GeometricalFigure implements Printable {
    private Point center;

    public GeometricalFigure(Point center) {
        this.center = center;
    }

    public final Point getCenter() {
        return center;
    }

    public abstract FigureType getFigureType();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean containsPoint(Point point);

    public abstract void printInformation();

}
